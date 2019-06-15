package dao;

import java.util.LinkedList;

import model.Funcionario;

public class FuncionarioDAO {
	
	private LinkedList<Funcionario> professores = new LinkedList<Funcionario>();
	
	public FuncionarioDAO() {
		
	}
	
	public int getSize() {
		return professores.size();
	}
	
	public LinkedList<Funcionario> getProfessores() {
		return professores;
	}
	
/*	public Funcionario getProfessorByLogin(String login) {
		for(Funcionario p : professores) {
			if(p.getLogin().equals(login)) {
				return p;
			}
		}
		return null;
	}*/
}
