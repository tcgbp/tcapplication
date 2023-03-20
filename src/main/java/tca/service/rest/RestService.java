package tca.service.rest;


import org.springframework.core.ParameterizedTypeReference;


public interface RestService {

	<T> T postForObject(String url, Object request, Class<T> responseType);

}
