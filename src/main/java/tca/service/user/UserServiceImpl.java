package tca.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tca.entity.role.Role;
import tca.entity.user.User;
import tca.mapper.role.RoleMapper;
import tca.mapper.user.UserMapper;
import tca.model.UserFilter;

import java.util.HashSet;
import java.util.List;

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
    public long getTotalCount(UserFilter filter) {
        return userMapper.getTotalCount(filter);
    }

    @Override
    public long getTotalNotFilteredCount() {
        return userMapper.getTotalNotFilteredCount();
    }

    @Override
    public User getUserById(Long id) {
        User user = userMapper.getUserById(id).orElseThrow();
        user.setRoles(new HashSet<>(roleMapper.getUserRolesByUserId(user.getLoginId())));
        return user;
    }

    @Override
    public List<Role> getAllRoles() {
        return roleMapper.getAll();
    }

}
