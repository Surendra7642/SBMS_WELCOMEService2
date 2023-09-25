package com.welcome.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient(name="GREET-API")
//@FeignClient(url="http://localhost:9090",name = "greet")
public interface GreetApiClient {

	@GetMapping("/greet")
	public String invokeGreetApi();

}
