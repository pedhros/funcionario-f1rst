package br.com.f1rst.funcionario_f1rst.funcionario.application.service;

import org.springframework.stereotype.Service;

import br.com.f1rst.funcionario_f1rst.funcionario.application.api.FuncionarioRequest;
import br.com.f1rst.funcionario_f1rst.funcionario.application.api.FuncionarioResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class FuncionarioApplicationService implements FuncionarioService {

	@Override
	public FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest) {
		log.info("[inicia] FuncionarioApplicationService - criaFuncionario");
		log.info("[finaliza] FuncionarioApplicationService - criaFuncionario");
		return null;
	}
}
