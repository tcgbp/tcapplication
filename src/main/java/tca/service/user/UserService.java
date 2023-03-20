package tca.service.user;

import java.util.List;

import tca.entity.role.Role;
import tca.entity.user.User;
import tca.model.UserFilter;

public interface UserService {


	void addUser(User user);

	void updateUser(User user);

	List<User> getAll();

    User getUserById(Long id);

    List<Role> getAllRoles();

	void deleteUserById(Long id);

	List<User> getUserList(UserFilter filter);


}
