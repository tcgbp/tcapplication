package tca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages="tca")
public class GCCTCAApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(GCCTCAApplication.class, args);
	}

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        try {
            SpringApplicationBuilder builder = application.sources(GCCTCAApplication.class);
            return builder;
        } catch (Exception e) {
            logger.error("Bootstrap failed!", e);
        }
        return null;
    }
}
