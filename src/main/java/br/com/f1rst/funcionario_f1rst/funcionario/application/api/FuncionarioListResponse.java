package br.com.f1rst.funcionario_f1rst.funcionario.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.f1rst.funcionario_f1rst.funcionario.domain.Funcionario;
import lombok.Value;

@Value
public class FuncionarioListResponse {
	private UUID idFuncionario;
	private String nomeCompleto;
	private String designacao;
	private String salario;
	private String email;
	private String telefone;
	
	public static List<FuncionarioListResponse> converte(List<Funcionario> funcionarios) {
		return funcionarios.stream()
				.map(FuncionarioListResponse::new)
				.collect(Collectors.toList());
	}

	private FuncionarioListResponse(Funcionario funcionario) {
		this.idFuncionario = funcionario.getIdFuncionario();
		this.nomeCompleto = funcionario.getNomeCompleto();
		this.designacao = funcionario.getDesignacao();
		this.salario = funcionario.getSalario();
		this.email = funcionario.getEmail();
		this.telefone = funcionario.getTelefone();
	}
}
