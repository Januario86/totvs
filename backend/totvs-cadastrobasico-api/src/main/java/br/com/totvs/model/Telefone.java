package br.com.totvs.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Telefone {
	
	@JsonProperty("id")
	private Long id;
	@JsonProperty("numero")
	private Long numeroTelefone;

}
