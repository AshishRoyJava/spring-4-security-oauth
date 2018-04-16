package ml.bootcode.spring.oauth.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String sayHello() {
		return "Hello OAuth";
	}

	@GetMapping("/secured")
	public String secured() {
		return "I am Secured";
	}
}
