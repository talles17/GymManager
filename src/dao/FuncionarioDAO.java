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
	
	
}
