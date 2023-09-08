package model;

import java.sql.Date;

public class ClienteModel {

	private long idCliente;
	private String nomeCliente;
	private long cpfCliente;
	private long rgCliente;
	private Date dataNascimento;
	private String telefoneCliente;
	private String emailCliente;

	public ClienteModel(long idCliente, String nomeCliente, long cpfcliente, long rgCliente, Date dataNascimento,
			String telefoneCliente, String emailCliente) {
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.cpfcliente = cpfcliente;
		this.rgCliente = rgCliente;
		this.dataNascimento = dataNascimento;
		this.telefoneCliente = telefoneCliente;
		this.emailCliente = emailCliente;
	}
	
	public ClienteModel () {
		
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public long getCpfcliente() {
		return cpfcliente;
	}

	public void setCpfcliente(long cpfcliente) {
		this.cpfcliente = cpfcliente;
	}

	public long getRgCliente() {
		return rgCliente;
	}

	public void setRgCliente(long rgCliente) {
		this.rgCliente = rgCliente;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

}
