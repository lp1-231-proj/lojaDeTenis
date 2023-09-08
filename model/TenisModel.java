package model;

import model.ClienteModel;
import model.FuncionarioModel;
import model.VendaModel;

public class TenisModel {
	
	private long idTenis;
	private double preco;
	private int tamanho;
	private String colorway;
	private String modelo;
	private String quantidade;
	
	
	public TenisModel(long idTenis, double preco, int tamanho, String colorway, String modelo, String quantidade) {
		this.idTenis = idTenis;
		this.preco = preco;
		this.tamanho = tamanho;
		this.colorway = colorway;
		this.modelo = modelo;
		this.quantidade = quantidade; 
		
		
	}

	public TenisModel() {
		
	}
	

	public long getIdTenis() {
		return idTenis;
	}


	public void setIdTenis(long idTenis) {
		this.idTenis = idTenis;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public int getTamanho() {
		return tamanho;
	}


	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}


	public String getColorway() {
		return colorway;
	}


	public void setColorway(String colorway) {
		this.colorway = colorway;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	 
	
	
}
