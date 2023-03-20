package tca.mapper.role;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tca.entity.role.Role;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Mapper
public interface RoleMapper {

    List<Role> getUserRolesByUserId(@Param("userId") String userid);

    List<Role> getAll() ;

    Optional<Role> getByName(@Param("name") String name);

    Optional<Role> getById(@Param("id") Long id);

    void addUserRoles(@Param("userId") long userId, Set<Role> roles);

    void removeUserRoles(@Param("userId") long userId);
}
