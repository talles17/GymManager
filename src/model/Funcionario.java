package model;

public class Funcionario {
	
	private int matricula;
	private String cpf;
	private String pis;
	private String nome;
	private String sobrenome;
	private char sexo;
	private String data_nascimento;
	private String turno;
	private float salario_bruto;
	private String cargo;
	
	
	public Funcionario(int matricula, String cpf, String pis, String nome, String sobrenome, char sexo,
			String data_nascimento, String turno, float salario_bruto, String cargo) {
		
		this.matricula = matricula;
		this.cpf = cpf;
		this.pis = pis;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.data_nascimento = data_nascimento;
		this.turno = turno;
		this.salario_bruto = salario_bruto;
		this.cargo = cargo;
	}
	
	
	
}
