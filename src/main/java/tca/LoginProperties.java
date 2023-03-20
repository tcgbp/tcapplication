package tca;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "login")
public class LoginProperties {

    /*
     * Login method: db or rest
     */
    private String method = "db";

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getRestUrl() {
        return restUrl;
    }

    public void setRestUrl(String restUrl) {
        this.restUrl = restUrl;
    }

    private String restUrl;

    public boolean isEnableCaptcha() {
        return enableCaptcha;
    }

    public void setEnableCaptcha(boolean enableCaptcha) {
        this.enableCaptcha = enableCaptcha;
    }

    private boolean enableCaptcha;

}
