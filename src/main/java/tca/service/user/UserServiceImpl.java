package tca.service.user;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tca.entity.role.Role;
import tca.entity.user.User;
import tca.mapper.role.RoleMapper;
import tca.mapper.user.UserMapper;
import tca.model.UserFilter;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	@Autowired
	RoleMapper roleMapper;


	@Override
	public void addUser(User user) {
		userMapper.addUser(user);
        if(!user.getRoles().isEmpty()) {
            roleMapper.addUserRoles(user.getId(), user.getRoles());
        }
	}

	@Override
	public void updateUser(User user) {
		userMapper.updateUser(user);
        roleMapper.removeUserRoles(user.getId());
        if(!user.getRoles().isEmpty()) {
            roleMapper.addUserRoles(user.getId(), user.getRoles());
        }
	}

	@Override
	public void deleteUserById(Long id) {
		userMapper.deleteUserById(id);
		// roleMapper.removeUserRoles(id);
	}

	@Override
	public List<User> getAll() {
		return userMapper.findAll();
	}

	@Override
	public List<User> getUserList(UserFilter filter) {
		return userMapper.getUserList(filter);
	}

    @Override
    public User getUserById(Long id) {
        User user = userMapper.getUserById(id).get();
        user.setRoles(roleMapper.getUserRolesByUserId(user.getLoginId()).stream().collect(Collectors.toSet()));
        return user;
    }

    @Override
    public List<Role> getAllRoles() {
        return roleMapper.getAll();
    }

}
