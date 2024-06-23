package br.com.f1rst.funcionario_f1rst.funcionario.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.f1rst.funcionario_f1rst.funcionario.application.api.FuncionarioRequest;
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
public class Funcionario {
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
	
	public Funcionario(FuncionarioRequest funcionarioRequest) {
		this.nomeCompleto = funcionarioRequest.getNomeCompleto();
		this.email = funcionarioRequest.getEmail();
		this.designacao = funcionarioRequest.getDesignacao();
		this.salario = funcionarioRequest.getSalario();
		this.telefone = funcionarioRequest.getTelefone();
		this.endereco = funcionarioRequest.getEndereco();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}
}
