package br.com.f1rst.funcionario_f1rst.funcionario.application.api;

import java.util.List;
import java.util.UUID;

import br.com.f1rst.funcionario_f1rst.funcionario.domain.Funcionario;

public class FuncionarioListResponse {
	private UUID idFuncionario;
	private String nomeCompleto;
	private String designacao;
	private String email;
	private String telefone;
	
	public static List<FuncionarioListResponse> converte(List<Funcionario> funcionarios) {
		return null;
	}
}
