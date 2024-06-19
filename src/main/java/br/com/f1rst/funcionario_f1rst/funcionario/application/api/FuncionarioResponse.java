package br.com.f1rst.funcionario_f1rst.funcionario.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class FuncionarioResponse {
	private UUID idFuncionario;
}
