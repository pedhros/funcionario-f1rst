package br.com.f1rst.funcionario_f1rst.funcionario.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.f1rst.funcionario_f1rst.funcionario.application.api.FuncionarioListResponse;
import br.com.f1rst.funcionario_f1rst.funcionario.application.api.FuncionarioRequest;
import br.com.f1rst.funcionario_f1rst.funcionario.application.api.FuncionarioResponse;
import br.com.f1rst.funcionario_f1rst.funcionario.application.repository.FuncionarioRepository;
import br.com.f1rst.funcionario_f1rst.funcionario.domain.Funcionario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class FuncionarioApplicationService implements FuncionarioService {
	private final FuncionarioRepository funcionarioRepository;

	@Override
	public FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest) {
		log.info("[inicia] FuncionarioApplicationService - criaFuncionario");
		Funcionario funcionario = funcionarioRepository.salva(new Funcionario(funcionarioRequest));
		log.info("[finaliza] FuncionarioApplicationService - criaFuncionario");
		return FuncionarioResponse.builder()
				.idFuncionario(funcionario.getIdFuncionario())
				.build();
	}

	@Override
	public List<FuncionarioListResponse> buscaTodosFuncionarios() {
		log.info("[inicia] FuncionarioApplicationService - buscaTodosFuncionarios");
		List<Funcionario> funcionarios = funcionarioRepository.buscaTodosFuncionarios();
		log.info("[finaliza] FuncionarioApplicationService - buscaTodosFuncionarios");
		return FuncionarioListResponse.converte(funcionarios);
	}
}
