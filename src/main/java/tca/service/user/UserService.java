package tca.service.user;

import tca.entity.user.User;
import tca.model.UserFilter;

import java.util.List;

public interface UserService {


	void addUser(User user);

	void updateUser(User user);

    User getUserById(Long id);

	void deleteUserById(Long id);

	List<User> getUserList(UserFilter filter);

    long getTotalCount(UserFilter filter);

    long getTotalNotFilteredCount();
}
