package model;

import java.sql.Date;

public class Funcionario {
	
	private int matricula;
	private String cpf;
	private String pis;
	private String nome;
	private String sobrenome;
	private String sexo;
	private Date data_nascimento;
	private String turno;
	private float salario_bruto;
	private int cargo;
	
	
	public Funcionario(int matricula, String cpf, String pis, String nome, String sobrenome, String sexo,
			Date data_nascimento, String turno, float salario_bruto, int cargo) {
		
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


	public String getPis() {
		return pis;
	}


	public void setPis(String pis) {
		this.pis = pis;
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


	public Date getData_nascimento() {
		return data_nascimento;
	}


	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}


	public String getTurno() {
		return turno;
	}


	public void setTurno(String turno) {
		this.turno = turno;
	}


	public float getSalario_bruto() {
		return salario_bruto;
	}


	public void setSalario_bruto(float salario_bruto) {
		this.salario_bruto = salario_bruto;
	}


	public int getCargo() {
		return cargo;
	}


	public void setCargo(int cargo) {
		this.cargo = cargo;
	}
	
	
	
}
