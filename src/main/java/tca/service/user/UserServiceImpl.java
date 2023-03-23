package tca.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
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
    @Cacheable("UserLists")
	public List<User> getUserList(UserFilter filter) {
		return userMapper.getUserList(filter);
	}

    @Override
    @Cacheable("UserTotalCount")
    public long getTotalCount(UserFilter filter) {
        return userMapper.getTotalCount(filter);
    }

    @Override
    @Cacheable("UserTotalNotFilteredCount")
    public long getTotalNotFilteredCount() {
        return userMapper.getTotalNotFilteredCount();
    }

    @Override
    @Cacheable("Users")
    public User getUserById(Long id) {
        User user = userMapper.getUserById(id).orElseThrow();
        user.setRoles(new HashSet<>(roleMapper.getUserRolesByUserId(user.getLoginId())));
        return user;
    }

}
