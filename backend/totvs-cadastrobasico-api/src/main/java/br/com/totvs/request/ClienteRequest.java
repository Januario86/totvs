package br.com.totvs.request;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.totvs.model.Telefone;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClienteRequest implements Serializable {

	private static final long serialVersionUID = 3763088916606276279L;

	@JsonProperty("nome")
	private String nome;
	
    @JsonProperty("endereco")
    private String endereco;

    @JsonProperty("bairro")
    private String bairro;

    @JsonProperty("telefone")
    private List<Telefone> telefones;

}
