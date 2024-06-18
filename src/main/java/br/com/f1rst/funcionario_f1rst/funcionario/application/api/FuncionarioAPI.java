package br.com.f1rst.funcionario_f1rst.funcionario.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/funcionario")
public interface FuncionarioAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	FuncionarioResponse postFuncionario(@RequestBody FuncionarioRequest funcionarioRequest);
}