package br.com.f1rst.funcionario_f1rst.funcionario.application.repository;

import java.util.List;

import br.com.f1rst.funcionario_f1rst.funcionario.domain.Funcionario;

public interface FuncionarioRepository {
	Funcionario salva(Funcionario funcionario);
	List<Funcionario> buscaTodosFuncionarios();
}