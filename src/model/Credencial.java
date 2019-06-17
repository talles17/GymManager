package model;

public class Credencial {

	private int id_credencial;
	private int funcionario_matricula;
	private String login;
	private String senha;

	
	public Credencial(int id_credencial, int funcionario_matricula, String login, String senha) {
		
		this.id_credencial = id_credencial;
		this.funcionario_matricula = funcionario_matricula;
		this.login = login;
		this.senha = senha;
	}


	public int getId_credencial() {
		return id_credencial;
	}


	public void setId_credencial(int id_credencial) {
		this.id_credencial = id_credencial;
	}


	public int getFuncionario_matricula() {
		return funcionario_matricula;
	}


	public void setFuncionario_matricula(int funcionario_matricula) {
		this.funcionario_matricula = funcionario_matricula;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}
	

}
