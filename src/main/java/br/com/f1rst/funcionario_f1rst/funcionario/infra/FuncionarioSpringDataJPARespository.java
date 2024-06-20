package br.com.f1rst.funcionario_f1rst.funcionario.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.f1rst.funcionario_f1rst.funcionario.domain.Funcionario;

public interface FuncionarioSpringDataJPARespository extends JpaRepository<Funcionario, UUID>{

}
