package ml.bootcode.spring.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

import ml.bootcode.spring.oauth.models.CustomUserDetails;
import ml.bootcode.spring.oauth.repositories.UserRepository;

@SpringBootApplication
public class SpringSecurityOauthSpring4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityOauthSpring4Application.class, args);
	}

	public void authenticationManager(AuthenticationManagerBuilder builder, UserRepository repo) throws Exception {
		builder.userDetailsService(username -> new CustomUserDetails(repo.findByUsername(username)));
	}
}
