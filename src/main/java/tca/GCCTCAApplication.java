package tca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication(scanBasePackages="tca")
@EnableCaching
public class GCCTCAApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(GCCTCAApplication.class, args);
	}

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public CacheManager cacheManager() {
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        cacheManager.setCaches(Arrays.asList(
            new ConcurrentMapCache("Roles"),
            new ConcurrentMapCache("RolesDropDown"),
            new ConcurrentMapCache("OrganizationsDropDown"),
            new ConcurrentMapCache("Users"),
            new ConcurrentMapCache("UserTotalCount"),
            new ConcurrentMapCache("UserTotalNotFilteredCount"),
            new ConcurrentMapCache("UserLists")));
        return cacheManager;
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        try {
            return application.sources(GCCTCAApplication.class);
        } catch (Exception e) {
            logger.error("Bootstrap failed!", e);
        }
        return null;
    }
}
