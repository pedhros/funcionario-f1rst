package br.com.f1rst.funcionario_f1rst.funcionario.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	private UUID idFuncionario;
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
	
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
	public funcionario(@NotBlank String nomeCompleto, @NotBlank @Email String email, @NotBlank String designacao,
			@NotBlank @NotBlank String salario, @NotBlank String telefone, @NotBlank String endereco) {
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.designacao = designacao;
		this.salario = salario;
		this.telefone = telefone;
		this.endereco = endereco;
		this.dataHoraDoCadastro = LocalDateTime.now();
	}
	
	
}
