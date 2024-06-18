package com.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
			title = "UserOpenApi",
			description = "demo project",
			version = "1.0",
			contact = @Contact(
				name = "API Support",
				url = "localhost:8080/support",
				email = "sahalysyk02@mail.ru"
			)
		),
		servers = {
				@Server(url = "http/localhost:8095")
		}
)
public class SwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerApplication.class, args);
	}

}
