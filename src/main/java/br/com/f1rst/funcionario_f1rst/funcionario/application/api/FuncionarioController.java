package br.com.f1rst.funcionario_f1rst.funcionario.application.api;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import br.com.f1rst.funcionario_f1rst.funcionario.application.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class FuncionarioController implements FuncionarioAPI {
	private final FuncionarioService funcionarioService;

	@Override
	public FuncionarioResponse postFuncionario(FuncionarioRequest funcionarioRequest) {
		log.info("[inicia] FuncionarioController - postFuncionario");
		FuncionarioResponse funcionarioCriado = funcionarioService.criaFuncionario(funcionarioRequest);
		log.info("[finaliza] FuncionarioController - postFuncionario");
		return funcionarioCriado;
	}

	@Override
	public List<FuncionarioListResponse> getTodosFuncionarios() {
		log.info("[inicia] getTodosFuncionarios - postFuncionario");
		log.info("[finaliza] getTodosFuncionarios - postFuncionario");
		return null;
	}
}
