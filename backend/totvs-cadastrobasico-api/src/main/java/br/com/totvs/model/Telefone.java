package br.com.totvs.model;

import java.io.Serializable;
import java.util.Objects;

public class Telefone implements Serializable {
	
	private static final long serialVersionUID = 7450360822852644013L;
	
	private String numero;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Telefone [numero=" + numero + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		return Objects.equals(numero, other.numero);
	}
	
}
