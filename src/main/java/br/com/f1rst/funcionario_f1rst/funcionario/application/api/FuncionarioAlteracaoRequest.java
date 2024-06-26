package br.com.f1rst.funcionario_f1rst.funcionario.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class FuncionarioAlteracaoRequest {
		@NotBlank
		private String nomeCompleto;
		@NotBlank
		private String designacao;
		@NotBlank
		private String salario;
		@NotBlank
		private String telefone;
		@NotBlank
		private String endereco;
	}