package br.com.f1rst.funcionario_f1rst.funcionario.infra;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.f1rst.funcionario_f1rst.funcionario.application.repository.FuncionarioRepository;
import br.com.f1rst.funcionario_f1rst.funcionario.domain.Funcionario;
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
		funcionarioSpringDataJPARespository.save(funcionario);
		log.info("[finaliza] FuncionarioInfraRepository - salva");
		return funcionario;
	}

	@Override
	public List<Funcionario> buscaTodosFuncionarios() {
		log.info("[inicia] FuncionarioInfraRepository - buscaTodosFuncionarios");
		log.info("[finaliza] FuncionarioInfraRepository - buscaTodosFuncionarios");
		return null;
	}

}
