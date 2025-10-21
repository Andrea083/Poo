package br.edu.fatecfranca.ExemploAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//sobe o servidor
public class ExemploApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploApiApplication.class, args);
	}
}
