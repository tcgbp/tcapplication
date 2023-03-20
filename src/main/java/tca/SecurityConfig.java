package tca;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.context.SecurityContextPersistenceFilter;
import tca.security.TCAAuthenticationFilter;

import static org.springframework.security.config.Customizer.withDefaults;

@SuppressWarnings("deprecation")
@EnableWebSecurity
@EnableMethodSecurity( jsr250Enabled = true )
@Configuration
public class SecurityConfig {

	@Bean
    public TCAAuthenticationFilter getTCAAuthenticationFilter() {
        return new TCAAuthenticationFilter();
    }

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring().requestMatchers("/","/favicon.ico","/images/**","/css/*","/js/**","/fonts/*");
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .headers().frameOptions().sameOrigin().and()
            .csrf().disable()
            .formLogin().loginPage("/login.html").permitAll().and()
            .logout().logoutSuccessUrl("/").and()
            .exceptionHandling().accessDeniedPage("/403.html").and()
            .addFilterBefore(new SecurityContextPersistenceFilter(), UsernamePasswordAuthenticationFilter.class)
            .addFilterBefore(getTCAAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class)
            .authorizeHttpRequests((authz) -> authz
                .requestMatchers("/admin/**").hasRole("ADMIN")
                .requestMatchers("/enquiry/**").hasRole("ENQUIRY")
                .requestMatchers("/report/**").hasRole("REPORT")
                .requestMatchers("/login","/userLogin","/getCaptchaImg").permitAll()
                .anyRequest().authenticated()
            )
            .httpBasic(withDefaults());
        return http.build();
    }

}
