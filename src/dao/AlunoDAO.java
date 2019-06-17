package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import conexao.ConexaoComBD;
import model.Aluno;
import model.Funcionario;
import util.Util;

public class AlunoDAO {

	
	public void cadastrarAluno(Aluno aluno) {
		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;

        try {
            stmt = conexao.prepareStatement("INSERT INTO aluno (matricula, cpf, nome, sobrenome, sexo, data_nascimento, status_matricula, objetivo, anamnese)VALUES(?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1, Util.geradorDeMatricula());
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
	
	public List<Aluno> getAllAluno() throws SQLException {
		
		String sql = "SELECT * FROM aluno";
		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;
		List<Aluno> listaAlunos = new ArrayList<>();
        
		try {
            stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
            	listaAlunos.add(new Aluno(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDate(6),rs.getBoolean(7),rs.getString(8),rs.getString(9)));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConexaoComBD.closeConnection(conexao, stmt);
        }
 
		
		
		return listaAlunos;
		
	}
	
	public void updateAluno(Integer matricula, Aluno aluno) throws SQLException {
		String sql = "UPDATE INTO aluno (matricula, cpf, nome, sobrenome, sexo, data_nascimento, status_matricula, objetivo, anamnese)VALUES(" + matricula + ",?,?,?,?,?,?,?,?,W) "
					+ "WHERE matricula = " + matricula;
		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(2, aluno.getCpf());
            stmt.setString(3, aluno.getNome());
            stmt.setString(4, aluno.getSobrenome());
            stmt.setString(5, aluno.getSexo());
            stmt.setDate(6, aluno.getData_nascimento());
            stmt.setBoolean(7, aluno.isStatus_matricula());
            stmt.setString(8, aluno.getObjetivo());
            stmt.setString(9, aluno.getAnamnese());
            

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
		} finally {
			ConexaoComBD.closeConnection(conexao, stmt);
		}
	}
	
	public void deleteAluno(Integer matricula) throws SQLException {
		String sql = "DELETE FROM aluno WHERE matricula = " + matricula;
		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = conexao.prepareStatement(sql);
		} finally {
			ConexaoComBD.closeConnection(conexao, stmt);
		}
	}
	
	public List<Aluno> getByMatricula() throws SQLException {
	
		String sql = "SELECT * FROM aluno";
		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;
		List<Aluno> listaAlunos = new ArrayList<>();
        try {
            stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
            	listaAlunos.add(new Aluno(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDate(6),rs.getBoolean(7),rs.getString(8),rs.getString(9)));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConexaoComBD.closeConnection(conexao, stmt);
        }
 
		
		
		return listaAlunos;
		
	}
	
	
}
