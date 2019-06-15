package model;

public class Pagamento {
	
	private int id_pagamento;
	private int funcionario_matricula;
	private String data_pagamento;
	private float valor_bruto;
	private float valor_liquido;
	
	public Pagamento(int id_pagamento, int funcionario_matricula, String data_pagamento, float valor_bruto,
			float valor_liquido) {
		
		this.id_pagamento = id_pagamento;
		this.funcionario_matricula = funcionario_matricula;
		this.data_pagamento = data_pagamento;
		this.valor_bruto = valor_bruto;
		this.valor_liquido = valor_liquido;
	}
	
	
}
