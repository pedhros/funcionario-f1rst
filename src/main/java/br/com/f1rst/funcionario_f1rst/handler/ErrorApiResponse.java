package br.com.f1rst.funcionario_f1rst.handler;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class ErrorApiResponse {
	private String message;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	private String description;

}
