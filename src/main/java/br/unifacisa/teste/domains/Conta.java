package br.unifacisa.teste.domains;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Conta {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@OneToMany
	private List<ItemVenda> ItensVenda = new ArrayList<ItemVenda>();

	private float totalVenda;

	private Date dataVenda;

	private float totalPago;
	@OneToOne
	private Usuario usuario;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<ItemVenda> getItensVenda() {
		return ItensVenda;
	}

	public void setItensVenda(List<ItemVenda> itensVenda) {
		ItensVenda = itensVenda;
	}

	public float getTotalVenda() {
		return totalVenda;
	}

	public void setTotalVenda(float totalVenda) {
		this.totalVenda = totalVenda;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public float getTotalPago() {
		return totalPago;
	}

	public void setTotalPago(float totalPago) {
		this.totalPago = totalPago;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
