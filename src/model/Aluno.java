package model;

public class Aluno {
	
	private int matricula;
	private String cpf;
	private String nome;
	private String sobrenome;
	private String sexo;
	private String data_nascimento;
	private boolean status_matricula;
	private String objetivo;
	private String anamnese;
	
	public Aluno() {
		
	}
	public Aluno(int matricula, String cpf, String nome, String sobrenome,
			String sexo, String data_nascimento, boolean status_matricula, 
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
	
	
	
	

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public boolean isStatus_matricula() {
		return status_matricula;
	}

	public void setStatus_matricula(boolean status_matricula) {
		this.status_matricula = status_matricula;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public String getAnamnese() {
		return anamnese;
	}

	public void setAnamnese(String anamnese) {
		this.anamnese = anamnese;
	}
	
	
}
