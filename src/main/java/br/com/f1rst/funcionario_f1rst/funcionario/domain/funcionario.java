package br.com.f1rst.funcionario_f1rst.funcionario.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class funcionario {
	@Id
	private UUID idFuncionario;
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	@Email
	private String email;
	@NotBlank
	private String designacao;
	@NotBlank
	private float salario;
	@NotBlank
	private String telefone;
	@NotBlank
	private String endereco;
	
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
	public funcionario(@NotBlank String nomeCompleto, @NotBlank @Email String email, @NotBlank String designacao,
			@NotBlank float salario, @NotBlank String telefone, @NotBlank String endereco) {
		this.idFuncionario = UUID.randomUUID();
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.designacao = designacao;
		this.salario = salario;
		this.telefone = telefone;
		this.endereco = endereco;
		this.dataHoraDoCadastro = LocalDateTime.now();
	}
	
	
}
