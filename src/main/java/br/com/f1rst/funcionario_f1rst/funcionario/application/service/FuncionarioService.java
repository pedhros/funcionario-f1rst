package br.com.f1rst.funcionario_f1rst.funcionario.application.service;

import java.util.List;

import br.com.f1rst.funcionario_f1rst.funcionario.application.api.FuncionarioListResponse;
import br.com.f1rst.funcionario_f1rst.funcionario.application.api.FuncionarioRequest;
import br.com.f1rst.funcionario_f1rst.funcionario.application.api.FuncionarioResponse;

public interface FuncionarioService {
	FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest);
	List<FuncionarioListResponse> buscaTodosFuncionarios();
}