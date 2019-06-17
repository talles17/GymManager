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
import model.Funcionario;
import model.Modalidade;
import util.Util;

public class ModalidadeDAO {
	
	public void cadastrarModalidade(Modalidade modalidade) {
		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;

        try {
            stmt = conexao.prepareStatement("INSERT INTO modalidade (id_modalidade, nome, valor)VALUES(?,?,?)");
            stmt.setInt(1, Util.geradorDeMatricula());
            stmt.setString(2, modalidade.getNome());
            stmt.setFloat(3, modalidade.getValor());
            

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConexaoComBD.closeConnection(conexao, stmt);
        }
	
	}

	public List<Modalidade> getAllModalidade() throws SQLException {
		
		String sql = "SELECT * FROM modalidade";
		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;
		List<Modalidade> listaModalidades= new ArrayList<>();
        
		try {
            stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
            	listaModalidades.add(new Modalidade(rs.getInt(1),rs.getString(2),rs.getFloat(3)));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConexaoComBD.closeConnection(conexao, stmt);
        }
 
		
		
		return listaModalidades;
		
	}
	
	public void updateModalidade(Integer id, Modalidade modalidade) throws SQLException {
		String sql = "UPDATE INTO modalidade(id_modalidade, nome, valor)VALUES(" + id+ ",?,?) "
					+ "WHERE matricula = " + id;
		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(2, modalidade.getNome());
	        stmt.setFloat(3, modalidade.getValor());

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
		} finally {
			ConexaoComBD.closeConnection(conexao, stmt);
		}
	}
	
	public void deleteModalidade(Integer id) throws SQLException {
		String sql = "DELETE FROM modalidade WHERE matricula = " + id;
		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = conexao.prepareStatement(sql);
		} finally {
			ConexaoComBD.closeConnection(conexao, stmt);
		}
	}
}
