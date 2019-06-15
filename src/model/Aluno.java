package model;

public class Aluno {
	
	private int matricula;
	private String cpf;
	private String nome;
	private String sobrenome;
	private char sexo;
	private String data_nascimento;
	private boolean status_matricula;
	private String objetivo;
	private String anamnese;
	
	public Aluno(int matricula, String cpf, String nome, String sobrenome,
			char sexo, String data_nascimento, boolean status_matricula, 
			String objetivo, String anamnese) {
		
		this.matricula = matricula;
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.data_nascimento = data_nascimento;
		this.status_matricula = status_matricula;
		this.objetivo = objetivo;
		this.anamnese = anamnese;
		
	}
}
