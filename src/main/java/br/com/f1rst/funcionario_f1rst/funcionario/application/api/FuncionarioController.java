package br.com.f1rst.funcionario_f1rst.funcionario.application.api;

import java.util.List;
import java.util.UUID;

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
		log.info("[inicia] FuncionarioController - getTodosFuncionarios");
		List<FuncionarioListResponse> funcionarios = funcionarioService.buscaTodosFuncionarios();
		log.info("[finaliza] FuncionarioController - getTodosFuncionarios");
		return funcionarios;
	}

	@Override
	public FuncionarioDetalhadoResponse getFuncionariosAtravesId(UUID idFuncionario) {
		log.info("[inicia] FuncionarioController - getFuncionariosAtravesId");
		log.info("[idFuncionario] {}", idFuncionario);
		log.info("[finaliza] FuncionarioController - getFuncionariosAtravesId");
		return null;
	}

}