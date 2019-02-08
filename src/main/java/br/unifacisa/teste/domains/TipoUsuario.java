package br.unifacisa.teste.domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoUsuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String tipo;

	private boolean gerencia;

	private boolean caixa;

	private boolean pdv;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isGerencia() {
		return gerencia;
	}

	public void setGerencia(boolean gerencia) {
		this.gerencia = gerencia;
	}

	public boolean isCaixa() {
		return caixa;
	}

	public void setCaixa(boolean caixa) {
		this.caixa = caixa;
	}

	public boolean isPdv() {
		return pdv;
	}

	public void setPdv(boolean pdv) {
		this.pdv = pdv;
	}

}
