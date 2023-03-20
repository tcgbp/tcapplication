package tca.service.login;

import tca.entity.user.User;

public interface LoginService {
	boolean validateUser(User user);

	User getUserByLoginId(String username);

	void saveProfile(User user);

	void savePassword(User user);
}
