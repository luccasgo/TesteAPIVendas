package br.unifacisa.teste.dtos;

import java.io.Serializable;

public class UpdateProdutoDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7559448829536899605L;
	private double qtdEstoque;
	private boolean comercializavel;
	private float valorUnitarioVenda;
	
	public double getQtdEstoque() {
		return qtdEstoque;
	}
	public void setQtdEstoque(double qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
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
