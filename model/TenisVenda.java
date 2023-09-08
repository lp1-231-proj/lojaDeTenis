package model;

public class TenisVenda {

	private Long idTenisVenda;
	private int quantidade; 
	private double preco;
	
	
	public TenisVenda(Long idTenisVenda, int quantidade, double preco) {
		this.idTenisVenda = idTenisVenda;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public TenisVenda(){
		
	}
	

	public Long getIdTenisVenda() {
		return idTenisVenda;
	}


	public void setIdTenisVenda(Long idTenisVenda) {
		this.idTenisVenda = idTenisVenda;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	
	
}

