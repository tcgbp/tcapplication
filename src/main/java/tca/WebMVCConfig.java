package tca;

import jakarta.annotation.Resource;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import tca.entity.role.RoleConverter;
import tca.model.RequestConverter;
import tca.model.UserConverter;

@Configuration
public class WebMVCConfig implements WebMvcConfigurer{

    @Resource
    private RoleConverter roleConverter;

    @Resource
    private UserConverter userConverter;

    @Resource
    private RequestConverter requestConverter;

    @Override
    public void addFormatters (FormatterRegistry registry) {
        registry.addConverter(roleConverter);
        registry.addConverter(userConverter);
        registry.addConverter(requestConverter);
    }
}
