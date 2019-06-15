package model;

public class Mensalidade {

	private int id_mensalidade;
	private int aluno_matricula;
	private String data_pagamento;
	private String data_vencimento;
	private boolean status_mensalidade;
	private float valor;
	
	public Mensalidade(int id_mensalidade, int aluno_matricula, String data_pagamento, String data_vencimento,
			boolean status_mensalidade, float valor) {
		
		this.id_mensalidade = id_mensalidade;
		this.aluno_matricula = aluno_matricula;
		this.data_pagamento = data_pagamento;
		this.data_vencimento = data_vencimento;
		this.status_mensalidade = status_mensalidade;
		this.valor = valor;
	}
	
	
	
}
