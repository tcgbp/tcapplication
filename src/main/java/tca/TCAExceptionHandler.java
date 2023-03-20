package tca;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import tca.common.Helper;

@ControllerAdvice(basePackages = {"com.tca.controller"} )
public class TCAExceptionHandler {

	@ExceptionHandler(value = Exception.class)
    public String handleException(Exception e) {
		e.printStackTrace();
		new Helper().writelog(e.getMessage(), "error");
		return "error";
    }
}
