package model;

public class Modalidade {

	private int id_modalidade;
	private String nome;
	private float valor;
	
	public Modalidade(int id_modalidade, String nome, float valor) {
		
		this.id_modalidade = id_modalidade;
		this.nome = nome;
		this.valor = valor;
	}

	public int getId_modalidade() {
		return id_modalidade;
	}

	public void setId_modalidade(int id_modalidade) {
		this.id_modalidade = id_modalidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
	
}
