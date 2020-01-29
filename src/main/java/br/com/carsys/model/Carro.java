package br.com.carsys.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="carros")
public class Carro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	@Column(name = "placa",nullable = false, length = 10)
	private String placa;
	
	@Column(name = "modelo", length = 50)
	private String modelo;
	
	@Column(name = "ano", length = 4)
	private String ano;
	
	@Column(name = "cor", length = 20)
	private String cor;
	
	@OneToOne(mappedBy = "carro", cascade = CascadeType.ALL)
	@JsonManagedReference
	private Compra compra; 
	
	@OneToOne(mappedBy = "carro", cascade = CascadeType.ALL)
	@JsonManagedReference
	private Venda venda;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Compra getCompra() {
		return compra;
	}
	public void setCompra(Compra compra) {
		this.compra = compra;
	}
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}

}
