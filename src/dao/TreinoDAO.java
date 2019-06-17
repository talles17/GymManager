package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

import conexao.ConexaoComBD;
import model.Exercicio;
import model.Funcionario;
import model.Treino;
import model.Aluno;

public class TreinoDAO {


	public void cadastrarTreino(Funcionario funcionario, Aluno aluno) {
		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;

        try {
            stmt = conexao.prepareStatement("INSERT INTO treino(funcionario_matricula, aluno_matricula)VALUES(?,?)");
            stmt.setInt(1, funcionario.getMatricula());
            stmt.setInt(2, aluno.getMatricula());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConexaoComBD.closeConnection(conexao, stmt);
        }
	
	}

	public List<Treino> getAllTreinos() throws SQLException {
		
		String sql = "SELECT * FROM treino";
		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;
		List<Treino> listaTreinos= new ArrayList<>();
        
		try {
            stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
            	listaTreinos.add(new Treino(rs.getInt(1),rs.getInt(2)));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConexaoComBD.closeConnection(conexao, stmt);
        }
 
		
		
		return listaTreinos;
		
	}
	
	public void updateTreino(Funcionario funcionario, Aluno aluno) throws SQLException {
		String sql = "UPDATE INTO treino (funcionario_matricula, aluno_matricula)VALUES(" + funcionario.getMatricula() + "," + aluno.getMatricula()  + ") "
					+ "WHERE aluno_matricula = " + aluno.getMatricula();
		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
		} finally {
			ConexaoComBD.closeConnection(conexao, stmt);
		}
	}
	
	public void deleteTreino(Funcionario funcionario, Aluno aluno) throws SQLException {
		String sql = "DELETE FROM treino WHERE funcionario_matricula= " + funcionario.getMatricula() + 
					"AND aluno_matricula = " + aluno.getMatricula();
		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = conexao.prepareStatement(sql);
		} finally {
			ConexaoComBD.closeConnection(conexao, stmt);
		}
	}

}
