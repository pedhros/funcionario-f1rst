package br.com.f1rst.funcionario_f1rst.funcionario.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/funcionario")
public interface FuncionarioAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	FuncionarioResponse postFuncionario(@Valid @RequestBody FuncionarioRequest funcionarioRequest);
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<FuncionarioListResponse> getTodosFuncionarios();
	
	@GetMapping(value = "/{idFuncionario}")
	@ResponseStatus(code = HttpStatus.OK)
	FuncionarioDetalhadoResponse getFuncionariosAtravesId(@PathVariable UUID idFuncionario);
	
	@DeleteMapping(value = "/{idFuncionario}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deletaFuncionariosAtravesId(@PathVariable UUID idFuncionario);
}
