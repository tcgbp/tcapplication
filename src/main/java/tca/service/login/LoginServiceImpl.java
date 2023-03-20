package tca.service.login;

import java.util.HashSet;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import tca.entity.role.Role;
import tca.entity.user.User;
import tca.mapper.login.LoginMapper;
import tca.mapper.role.RoleMapper;


@Service
public class LoginServiceImpl implements LoginService {

	Logger log = LoggerFactory.getLogger(LoginServiceImpl.class);

	@Autowired
	private LoginMapper loginMapper;


	@Autowired
	private RoleMapper roleMapper;

	public boolean validateUser(User user) {
		if(loginMapper.validateUser(user.getLoginId(), user.getPassword())){
            return true;
        }
        return false;
	}

	@Override
	public User getUserByLoginId(String loginId) {
		User user = loginMapper.findByLoginId(loginId).orElse(null);
        if (user == null)
            throw new UsernameNotFoundException("Username not found!");
        List<Role> roles = roleMapper.getUserRolesByUserId(loginId);
		user.setRoles(new HashSet<>(roles));
		return user;

	}

	@Override
	public void saveProfile(User user) {
		loginMapper.saveProfile(user);
	}

	@Override
	public void savePassword(User user) {
		loginMapper.savePassword(user);
	}
}
