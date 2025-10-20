package br.edu.fatecfranca.ExemploAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController  =isso não é muito certo, mas como era um exemplo pra nós vermos, colocamos ele
public class ExemploApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploApiApplication.class, args);
	}
}
