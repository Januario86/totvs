package br.com.totvs.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
public class Cliente {
	
	@JsonProperty("nome")
    private String nome;

    @JsonProperty("endereco")
    private String endereco;

    @JsonProperty("bairro")
    private String bairro;

    @JsonProperty("telefones")
    private List<Telefone> telefones;

	
}
