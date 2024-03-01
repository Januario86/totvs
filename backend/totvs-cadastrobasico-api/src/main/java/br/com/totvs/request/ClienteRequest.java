package br.com.totvs.request;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.totvs.model.Telefone;

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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	@Override
	public String toString() {
		return "ClienteRequest [nome=" + nome + ", endereco=" + endereco + ", bairro=" + bairro + ", telefones="
				+ telefones + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bairro, endereco, nome, telefones);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClienteRequest other = (ClienteRequest) obj;
		return Objects.equals(bairro, other.bairro) && Objects.equals(endereco, other.endereco)
				&& Objects.equals(nome, other.nome) && Objects.equals(telefones, other.telefones);
	}
    
}
