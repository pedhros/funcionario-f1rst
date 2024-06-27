package br.com.f1rst.funcionario_f1rst.funcionario.application.api;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.f1rst.funcionario_f1rst.funcionario.domain.Funcionario;
import lombok.Value;

@Value
public class FuncionarioDetalhadoResponse {
	private UUID idFuncionario;
	private String nomeCompleto;
	private String designacao;
	private String email;
	private String salario;
	private String telefone;
	private LocalDateTime dataHoraDoCadastro;

	public FuncionarioDetalhadoResponse(Funcionario funcionario) {
		this.idFuncionario = funcionario.getIdFuncionario();
		this.nomeCompleto = funcionario.getNomeCompleto();
		this.designacao = funcionario.getDesignacao();
		this.email = funcionario.getEmail();
		this.salario = funcionario.getSalario();
		this.telefone = funcionario.getTelefone();
		this.dataHoraDoCadastro = funcionario.getDataHoraDaUltimaAlteracao();
	}
}