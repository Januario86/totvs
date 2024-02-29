package br.com.totvs.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
	
	@JsonProperty("id")
    private Long idCliente;
	
	@JsonProperty("nome")
    private String nome;

    @JsonProperty("endereco")
    private String endereco;

    @JsonProperty("bairro")
    private String bairro;

    @JsonProperty("telefones")
    private List<Telefone> telefones;

	
}
