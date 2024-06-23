package br.com.f1rst.funcionario_f1rst.funcionario.application.api;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Value;

@Value
public class FuncionarioDetalhadoResponse {
	private UUID idFuncionario;
	private String nomeCompleto;
	private String designacao;
	private String email;
	private String telefone;
	private LocalDateTime dataHoraDoCadastro;
}