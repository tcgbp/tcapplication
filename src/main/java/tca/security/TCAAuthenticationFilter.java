package tca.security;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tca.LoginProperties;
import tca.common.constants.ApplicationConstants;
import tca.common.helper.Helper;
import tca.entity.user.User;
import tca.service.login.LoginService;
import tca.service.rest.RestService;

public class TCAAuthenticationFilter extends OncePerRequestFilter {

	@Autowired
    private LoginProperties loginProperties;

    @Autowired
    private LoginService loginService;

    @Autowired
    private RestService restService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String userId = request.getParameter("username");
        String password = request.getParameter("password");
        String captcha = request.getParameter("captcha");
        if (StringUtils.hasLength(userId) && StringUtils.hasLength(password)) {
            try {
                if(loginProperties.isEnableCaptcha()) {
                    String captchaServer = (String) request.getSession().getAttribute(ApplicationConstants.IMAGE_CODE_SESSION);
                    if (!captcha.equalsIgnoreCase(captchaServer)) {
                        throw new BadCredentialsException("Captcha is not correct!");
                    }
                }

                User user = new User();
                user.setLoginId(userId);
                user.setPassword(password);
                String encodedPassword = Helper.convertMD5(password);
                user.setPassword(encodedPassword);

                if (loginProperties.getMethod().equals("rest")) {
                    boolean loginSuccess = restService.postForObject(loginProperties.getRestUrl(), user, Boolean.class);
                    if (loginSuccess) {
                        user = loginService.getUserByLoginId(userId);
                        UserPrincipal userPrincipal = new UserPrincipal(user);
                        SecurityContextHolder.getContext().setAuthentication(
                            new UsernamePasswordAuthenticationToken(userPrincipal, encodedPassword, userPrincipal.getAuthorities()));
                    } else {
                        throw new BadCredentialsException("Password is not correct!");
                    }
                } else {
                    if (loginService.validateUser(user)) {
                        user = loginService.getUserByLoginId(userId);
                        UserPrincipal userPrincipal = new UserPrincipal(user);
                        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(userPrincipal, encodedPassword, userPrincipal.getAuthorities());
                        SecurityContextHolder.getContext().setAuthentication(token);
                    } else {
                        throw new BadCredentialsException("Password is not correct!");
                    }
                }
            }catch(Exception e){
                String errorMessage = e.getLocalizedMessage();
                request.setAttribute("error", errorMessage);
                request.setAttribute("fails_on_" + errorMessage.split(" ")[0].toLowerCase(), true);
            }
        }
        filterChain.doFilter(request, response);
    }

}

