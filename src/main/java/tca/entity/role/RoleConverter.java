package tca.entity.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import tca.mapper.role.RoleMapper;

@Component
public class RoleConverter implements Converter<String, Role> {

	@Autowired
	private RoleMapper roleMapper;

    @Override
    public Role convert(String id) {
    	return roleMapper.getById(Long.valueOf(id)).orElse(null);
    }
}
