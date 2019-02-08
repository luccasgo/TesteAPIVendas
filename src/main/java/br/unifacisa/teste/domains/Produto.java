package br.unifacisa.teste.domains;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	String codigoDeBarras;
	@NotNull
	private String nome;
	@ManyToMany
	private List<Categoria> categorias = new ArrayList<Categoria>();
	@NotEmpty
	private double qtdEstoque;
	@ManyToOne
	private TipoDeUnidade tipoDeUnidade;
	
	private float tamanhoUnidade;

	private boolean comercializavel;

	private float valorUnitarioVenda;

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public double getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(double qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public TipoDeUnidade getTipoDeUnidade() {
		return tipoDeUnidade;
	}

	public void setTipoDeUnidade(TipoDeUnidade tipoDeUnidade) {
		this.tipoDeUnidade = tipoDeUnidade;
	}

	public float getTamanhoUnidade() {
		return tamanhoUnidade;
	}

	public void setTamanhoUnidade(float tamanhoUnidade) {
		this.tamanhoUnidade = tamanhoUnidade;
	}

	public boolean isComercializavel() {
		return comercializavel;
	}

	public void setComercializavel(boolean comercializavel) {
		this.comercializavel = comercializavel;
	}

	public float getValorUnitarioVenda() {
		return valorUnitarioVenda;
	}

	public void setValorUnitarioVenda(float valorUnitarioVenda) {
		this.valorUnitarioVenda = valorUnitarioVenda;
	}

}
