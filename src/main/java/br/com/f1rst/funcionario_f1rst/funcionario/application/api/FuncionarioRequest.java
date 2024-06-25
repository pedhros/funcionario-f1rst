package br.com.f1rst.funcionario_f1rst.funcionario.application.api;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class FuncionarioRequest {
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	@Email
	private String email;
	@NotBlank
	private String designacao;
	@NotBlank
	private String salario;
	@NotBlank
	private String telefone;
	@NotBlank
	private String endereco;
}
