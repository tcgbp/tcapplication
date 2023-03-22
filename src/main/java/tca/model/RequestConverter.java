package tca.model;

import com.google.gson.Gson;
import jakarta.annotation.Resource;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import tca.entity.enquiry.Request;

@Component
public class RequestConverter implements Converter<String, Request> {

    @Resource
    private Gson gson;

    @Override
    public Request convert(String filter) {
        return gson.fromJson(filter, Request.class);
    }
}
