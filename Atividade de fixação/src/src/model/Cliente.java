package model;

public class Cliente {
	private String nome;
	private String sexo;
	private String cpf;
	private String profiss�o;
	private String endereco;

	public Cliente(String nome, String sexo, String cpf, String profiss�o, String endereco) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.cpf = cpf;
		this.profiss�o = profiss�o;
		this.endereco = endereco;
	}

	public Cliente() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfiss�o() {
		return profiss�o;
	}

	public void setProfiss�o(String profiss�o) {
		this.profiss�o = profiss�o;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
