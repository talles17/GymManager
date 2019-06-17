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



	public int getId_exercicio() {
		return id_exercicio;
	}



	public void setId_exercicio(int id_exercicio) {
		this.id_exercicio = id_exercicio;
	}



	public int getFuncionario_matricula() {
		return funcionario_matricula;
	}



	public void setFuncionario_matricula(int funcionario_matricula) {
		this.funcionario_matricula = funcionario_matricula;
	}



	public int getAluno_matricula() {
		return aluno_matricula;
	}



	public void setAluno_matricula(int aluno_matricula) {
		this.aluno_matricula = aluno_matricula;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getMusculo() {
		return musculo;
	}



	public void setMusculo(String musculo) {
		this.musculo = musculo;
	}



	public int getQtd_repeticoes() {
		return qtd_repeticoes;
	}



	public void setQtd_repeticoes(int qtd_repeticoes) {
		this.qtd_repeticoes = qtd_repeticoes;
	}



	public int getQtd_series() {
		return qtd_series;
	}



	public void setQtd_series(int qtd_series) {
		this.qtd_series = qtd_series;
	}
	
	
	
	
}
