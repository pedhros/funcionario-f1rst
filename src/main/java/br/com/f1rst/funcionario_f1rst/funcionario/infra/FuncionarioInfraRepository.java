package br.com.f1rst.funcionario_f1rst.funcionario.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.f1rst.funcionario_f1rst.funcionario.application.repository.FuncionarioRepository;
import br.com.f1rst.funcionario_f1rst.funcionario.domain.Funcionario;
import br.com.f1rst.funcionario_f1rst.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class FuncionarioInfraRepository implements FuncionarioRepository {
	private final FuncionarioSpringDataJPARespository funcionarioSpringDataJPARespository;

	@Override
	public Funcionario salva(Funcionario funcionario) {
		log.info("[inicia] FuncionarioInfraRepository - salva");
		try {
			funcionarioSpringDataJPARespository.save(funcionario);	
		} catch (DataIntegrityViolationException e) {
			throw APIException.build(HttpStatus.BAD_REQUEST, "O Email informado já está em uso!", e);
		}
		
		log.info("[finaliza] FuncionarioInfraRepository - salva");
		return funcionario;
	}

	@Override
	public List<Funcionario> buscaTodosFuncionarios() {
		log.info("[inicia] FuncionarioInfraRepository - buscaTodosFuncionarios");
		List<Funcionario> todosFuncionarios = funcionarioSpringDataJPARespository.findAll();
		log.info("[finaliza] FuncionarioInfraRepository - buscaTodosFuncionarios");
		return todosFuncionarios;
	}

	@Override
	public Funcionario buscaFuncionariosAtravesId(UUID idFuncionario) {
		log.info("[inicia] FuncionarioInfraRepository - buscaFuncionariosAtravesId");
		Funcionario funcionario = funcionarioSpringDataJPARespository.findById(idFuncionario)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Funcionário não encontrado!"));
		log.info("[finaliza] FuncionarioInfraRepository - buscaFuncionariosAtravesId");
		return funcionario;
	}

	@Override
	public void deletaFuncionario(Funcionario funcionario) {
		log.info("[inicia] FuncionarioInfraRepository - deletaFuncionario");
		funcionarioSpringDataJPARespository.delete(funcionario);
		log.info("[finaliza] FuncionarioInfraRepository - deletaFuncionario");
	}
}
