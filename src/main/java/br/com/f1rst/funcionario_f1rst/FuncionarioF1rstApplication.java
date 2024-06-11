package br.com.f1rst.funcionario_f1rst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping ("/")
public class FuncionarioF1rstApplication {

	@GetMapping
	public String getHomeTest() {
		return "Funcionario F1rst - API Home";
	}
	public static void main(String[] args) {
		SpringApplication.run(FuncionarioF1rstApplication.class, args);
	}

}
