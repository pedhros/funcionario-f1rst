package br.com.f1rst.funcionario_f1rst.funcionario.application.api;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class FuncionarioController implements FuncionarioAPI {

	@Override
	public FuncionarioResponse postFuncionario(FuncionarioRequest funcionarioRequest) {
		log.info("[inicia] FuncionarioController - postFuncionario");
		log.info("[finaliza] FuncionarioController - postFuncionario");
		return null;
	}

}
