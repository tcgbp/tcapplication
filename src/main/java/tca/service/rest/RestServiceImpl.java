package tca.service.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestServiceImpl implements RestService {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public <T> T postForObject(String url, Object params, Class<T> responseType) {
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<Object> request = new HttpEntity<>(params, headers);
		ResponseEntity<T> response = restTemplate.exchange(url, HttpMethod.POST, request, responseType);
		return response.getBody();

	}

}
