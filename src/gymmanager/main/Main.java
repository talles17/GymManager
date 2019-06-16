package gymmanager.main;

import java.sql.SQLException;

import dao.AlunoDAO;

public class Main {

	public static void main(String[] args) {
		
		AlunoDAO aluno = new AlunoDAO();
		
		try {
			System.out.println(aluno.getByMatricula(20191380));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
