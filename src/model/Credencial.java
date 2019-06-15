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

}
