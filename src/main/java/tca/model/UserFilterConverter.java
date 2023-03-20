package tca.model;

import com.google.gson.Gson;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import tca.entity.role.Role;
import tca.mapper.role.RoleMapper;

@Component
public class UserFilterConverter implements Converter<String, UserFilter> {

    @Resource
    private Gson gson;

    @Override
    public UserFilter convert(String filter) {
        UserFilter uf = gson.fromJson(filter, UserFilter.class);
        return uf;
    }
}
