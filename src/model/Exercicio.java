package model;

public class Exercicio {

	private int id_exercicio;
	private int funcionario_matricula;
	private int aluno_matricula;
	private String nome;
	private String musculo;
	private int qtd_repeticoes;
	private int qtd_series;
	
	
	
	public Exercicio(int id_exercicio, int funcionario_matricula, int aluno_matricula, String nome, String musculo,
			int qtd_repeticoes, int qtd_series) {
	
		this.id_exercicio = id_exercicio;
		this.funcionario_matricula = funcionario_matricula;
		this.aluno_matricula = aluno_matricula;
		this.nome = nome;
		this.musculo = musculo;
		this.qtd_repeticoes = qtd_repeticoes;
		this.qtd_series = qtd_series;
	}
	
	
	
	
}
