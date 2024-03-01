package br.com.totvs.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;


public class Cliente implements Serializable{
	
    private static final long serialVersionUID = 1407044598749083070L;

	private String nome;
   
    private String endereco;

    private String bairro;
    
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
		return "Cliente [nome=" + nome + ", endereco=" + endereco + ", bairro=" + bairro + ", telefones=" + telefones
				+ "]";
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
		Cliente other = (Cliente) obj;
		return Objects.equals(bairro, other.bairro) && Objects.equals(endereco, other.endereco)
				&& Objects.equals(nome, other.nome) && Objects.equals(telefones, other.telefones);
	}

	
	
}
