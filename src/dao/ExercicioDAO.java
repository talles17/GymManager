package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import conexao.ConexaoComBD;
import model.Exercicio;
import util.Util;

public class ExercicioDAO {

	
	public void cadastrarExercicio(Exercicio exercicio) {
		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;

        try {
            stmt = conexao.prepareStatement("INSERT INTO exercicio(id_exercicio, funcionario_matricula, aluno_matricula, nome, musculo, qtd_repeticoes, qtd_series)VALUES(?,?,?,?,?,?,?)");
            stmt.setInt(1, Util.geradorDeMatricula());
            stmt.setInt(2, exercicio.getFuncionario_matricula());
            stmt.setInt(3, exercicio.getAluno_matricula());
            stmt.setString(4, exercicio.getNome());
            stmt.setString(5, exercicio.getMusculo());
            stmt.setInt(6, exercicio.getQtd_repeticoes());
            stmt.setInt(7, exercicio.getQtd_series());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConexaoComBD.closeConnection(conexao, stmt);
        }
	
	}

	public List<Exercicio> getAllExercicios() throws SQLException {
		
		String sql = "SELECT * FROM exercicio";
		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;
		List<Exercicio> listaExercicios= new ArrayList<>();
        
		try {
            stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
            	listaExercicios.add(new Exercicio(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getInt(7)));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConexaoComBD.closeConnection(conexao, stmt);
        }
 
		
		
		return listaExercicios;
		
	}
	
	public void updateExercicio(Integer id, Exercicio exercicio) throws SQLException {
		String sql = "UPDATE INTO funcionario (id_exercicio, funcionario_matricula, aluno_matricula, nome, musculo, qtd_repeticoes, qtd_series)VALUES(" + id + ",?,?,?,?,?,?) "
					+ "WHERE matricula = " + id;
		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(2, exercicio.getFuncionario_matricula());
	        stmt.setInt(3, exercicio.getAluno_matricula());
	        stmt.setString(4, exercicio.getNome());
	        stmt.setString(5, exercicio.getMusculo());
	        stmt.setInt(6, exercicio.getQtd_repeticoes());
	        stmt.setInt(7, exercicio.getQtd_series());

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
		} finally {
			ConexaoComBD.closeConnection(conexao, stmt);
		}
	}
	
	public void deleteExercicio(Integer id) throws SQLException {
		String sql = "DELETE FROM exercicio WHERE id_exercicio = " + id;
		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = conexao.prepareStatement(sql);
		} finally {
			ConexaoComBD.closeConnection(conexao, stmt);
		}
	}
}
