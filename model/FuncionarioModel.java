package model;

import java.sql.Date;

public class FuncionarioModel {

	private long idFuncionario;
	private String nomeFuncionario;
	private long cpfFuncionario;
	private long rgFuncionario;
	private Date dataNascimento;
	private String telefoneFuncionario;
	private String emailFuncionario;
	private String cargo;
	private String cep;
	private String endereco;
	private String cidade;
	private String bairro;
	private String complemento;

	public FuncionarioModel(long idFuncionario, String nomeFuncionario, long cpfFuncionario, long rgFuncionario,
			Date dataNascimento, String telefoneFuncionario, String emailFuncionario, String cargo, String cep,
			String endereco, String cidade, String bairro, String complemento) {

		this.idFuncionario = idFuncionario;
		this.nomeFuncionario = nomeFuncionario;
		this.cpfFuncionario = cpfFuncionario;
		this.rgFuncionario = rgFuncionario;
		this.dataNascimento = dataNascimento;
		this.telefoneFuncionario = telefoneFuncionario;
		this.emailFuncionario = emailFuncionario;
		this.cargo = cargo;
		this.cep = cep;
		this.endereco = endereco;
		this.cidade = cidade;
		this.bairro = bairro;
		this.complemento = complemento; 
		
	} 
	
	public FuncionarioModel() {
		
	}

	public long getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(long idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public long getCpfFuncionario() {
		return cpfFuncionario;
	}

	public void setCpfFuncionario(long cpfFuncionario) {
		this.cpfFuncionario = cpfFuncionario;
	}

	public long getRgFuncionario() {
		return rgFuncionario;
	}

	public void setRgFuncionario(long rgFuncionario) {
		this.rgFuncionario = rgFuncionario;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTelefoneFuncionario() {
		return telefoneFuncionario;
	}

	public void setTelefoneFuncionario(String telefoneFuncionario) {
		this.telefoneFuncionario = telefoneFuncionario;
	}

	public String getEmailFuncionario() {
		return emailFuncionario;
	}

	public void setEmailFuncionario(String emailFuncionario) {
		this.emailFuncionario = emailFuncionario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}
