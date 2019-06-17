package model;

import java.sql.Date;

public class Mensalidade {

	private int id_mensalidade;
	private int aluno_matricula;
	private Date data_pagamento;
	private Date data_vencimento;
	private boolean status_mensalidade;
	private float valor;
	
	public Mensalidade(int id_mensalidade, int aluno_matricula, Date data_pagamento, Date data_vencimento,
			boolean status_mensalidade, float valor) {
		
		this.id_mensalidade = id_mensalidade;
		this.aluno_matricula = aluno_matricula;
		this.data_pagamento = data_pagamento;
		this.data_vencimento = data_vencimento;
		this.status_mensalidade = status_mensalidade;
		this.valor = valor;
	}

	public int getId_mensalidade() {
		return id_mensalidade;
	}

	public void setId_mensalidade(int id_mensalidade) {
		this.id_mensalidade = id_mensalidade;
	}

	public int getAluno_matricula() {
		return aluno_matricula;
	}

	public void setAluno_matricula(int aluno_matricula) {
		this.aluno_matricula = aluno_matricula;
	}

	public Date getData_pagamento() {
		return data_pagamento;
	}

	public void setData_pagamento(Date data_pagamento) {
		this.data_pagamento = data_pagamento;
	}

	public Date getData_vencimento() {
		return data_vencimento;
	}

	public void setData_vencimento(Date data_vencimento) {
		this.data_vencimento = data_vencimento;
	}

	public boolean isStatus_mensalidade() {
		return status_mensalidade;
	}

	public void setStatus_mensalidade(boolean status_mensalidade) {
		this.status_mensalidade = status_mensalidade;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
	
}
