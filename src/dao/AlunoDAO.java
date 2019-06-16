package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import conexao.ConexaoComBD;
import model.Aluno;

public class AlunoDAO {

	
	public void cadastrarAluno(Aluno aluno) {
		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;

        try {
            stmt = conexao.prepareStatement("INSERT INTO aluno (matricula, cpf, nome, sobrenome, sexo, data_nascimento, status_matricula, objetivo, anamnese)VALUES(?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1, aluno.getMatricula());
            stmt.setString(2, aluno.getCpf());
            stmt.setString(3, aluno.getNome());
            stmt.setString(4, aluno.getSobrenome());
            stmt.setString(5, aluno.getSexo());
            stmt.setDate(6, aluno.getData_nascimento());
            stmt.setBoolean(7, aluno.isStatus_matricula());
            stmt.setString(8, aluno.getObjetivo());
            stmt.setString(9, aluno.getAnamnese());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConexaoComBD.closeConnection(conexao, stmt);
        }

		
	}
	
	
	public Aluno getByMatricula(String matricula) {
		
		
		
		return null;
		
	}
	
	public List<Aluno> getAllOrdemAlfabetica() {
		return null;
	}
	
	public List<Aluno> findAllOrdemAlfabetica(Integer startPage, Integer maxPage) {
		return null;
	}

	public Aluno getByNome(String nome) {
		return null;
	}
	
	
}
