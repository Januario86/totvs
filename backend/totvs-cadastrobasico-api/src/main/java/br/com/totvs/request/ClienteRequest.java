package br.com.totvs.request;

import java.io.Serializable;

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
	@NotNull
	@Size(max=10)
	private String nome;
	private String endereco;
	private String bairro;

}
