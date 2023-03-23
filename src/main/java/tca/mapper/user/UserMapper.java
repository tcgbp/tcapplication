package tca.mapper.user;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import tca.entity.user.User;
import tca.model.UserFilter;

@Mapper
public interface UserMapper {

    List<User> getUserList(UserFilter filter);

    void deleteUserById(@Param("id")Long id);

    Optional<User> getUserById(@Param("id") Long id);

    void addUser(User user);

    void updateUser(User user);

    long getTotalCount(UserFilter filter);

    long getTotalNotFilteredCount();
}
