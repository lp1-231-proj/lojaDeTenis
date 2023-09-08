package model;

import java.sql.Date;
import model.ClienteModel;
import model.FuncionarioModel;

public class VendaModel {

	private long idVenda;
	private Date dataVenda;

	public VendaModel(long idVenda, Date dataVenda) {

		this.idVenda = idVenda;
		this.dataVenda = dataVenda;
	}

	public VendaModel() {
		
	}
	
	public long getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(long idVenda) {
		this.idVenda = idVenda;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

}
