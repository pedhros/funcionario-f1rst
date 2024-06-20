package br.com.f1rst.funcionario_f1rst.funcionario.infra;

import org.springframework.stereotype.Repository;

import br.com.f1rst.funcionario_f1rst.funcionario.application.repository.FuncionarioRepository;
import br.com.f1rst.funcionario_f1rst.funcionario.domain.Funcionario;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
public class FuncionarioInfraRepository implements FuncionarioRepository {

	@Override
	public Funcionario salva(Funcionario funcionario) {
		log.info("[inicia] FuncionarioInfraRepository - salva");
		log.info("[finaliza] FuncionarioInfraRepository - salva");
		return funcionario;
	}

}
