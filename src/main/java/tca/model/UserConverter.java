package tca.model;

import com.google.gson.Gson;
import jakarta.annotation.Resource;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import tca.entity.user.User;

@Component
public class UserConverter implements Converter<String, User> {

    @Resource
    private Gson gson;

    @Override
    public User convert(String filter) {
        return gson.fromJson(filter, User.class);
    }
}
