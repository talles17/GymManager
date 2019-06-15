package model;

public class Encargo {

	private int id_encargo;
	private int id_pagamento;
	private float valor_encargo;
	private String nome_encargo;
	private String regra_encargo;
	private float aliquota_encargo;
	
	
	
	public Encargo(int id_encargo, int id_pagamento, float valor_encargo, String nome_encargo, String regra_encargo,
			float aliquota_encargo) {
		
		this.id_encargo = id_encargo;
		this.id_pagamento = id_pagamento;
		this.valor_encargo = valor_encargo;
		this.nome_encargo = nome_encargo;
		this.regra_encargo = regra_encargo;
		this.aliquota_encargo = aliquota_encargo;
	}
	
	
	
}
