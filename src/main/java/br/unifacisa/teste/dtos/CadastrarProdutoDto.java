package br.unifacisa.teste.dtos;

import java.io.Serializable;

import br.unifacisa.teste.domains.Categoria;

public class CadastrarProdutoDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4071008704015396338L;

	private String nome;
	private Long usuario_id;
	private Categoria categoria;
	private String codigoDeBarras;
	

	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}

	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(Long usuario_id) {
		this.usuario_id = usuario_id;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
