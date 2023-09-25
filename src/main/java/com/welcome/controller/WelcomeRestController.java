package com.welcome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class WelcomeRestController {
	@Autowired
	private GreetApiClient greetClient;
	@Autowired
	private Environment env;
	@GetMapping("/welcome")
	public String getWelcomeMsg()
	{
		String port=env.getProperty("server.port");
		String welcomeMsg= "Welcome to Surya (" +port+ ")";
		String greetMsg = greetClient.invokeGreetApi();
		return welcomeMsg+" "+greetMsg;
			
	}

}
