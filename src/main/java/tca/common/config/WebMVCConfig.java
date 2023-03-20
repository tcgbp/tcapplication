package tca.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import jakarta.annotation.Resource;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import tca.entity.role.RoleConverter;
import tca.model.UserFilterConverter;

@Configuration
public class WebMVCConfig implements WebMvcConfigurer{

    @Resource
    private RoleConverter roleConverter;

    @Resource
    private UserFilterConverter userfilterConverter;

    @Override
    public void addFormatters (FormatterRegistry registry) {
        registry.addConverter(roleConverter);
        registry.addConverter(userfilterConverter);
    }
}
