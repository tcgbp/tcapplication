package tca.mapper.login;

import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import tca.entity.user.User;

@Mapper
public interface LoginMapper {
	boolean validateUser(@Param("userId") String userId, @Param("password") String password);

	Optional<User> findByLoginId(@Param("userid") String userid);

	void saveProfile(User user);

	void savePassword(User user);
}
