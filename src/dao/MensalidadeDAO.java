package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import conexao.ConexaoComBD;
import model.Mensalidade;
import util.Util;

public class MensalidadeDAO {

	public void cadastrarMensalidade(Mensalidade mensalidade) {
		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;

        try {
            stmt = conexao.prepareStatement("INSERT INTO mensalidade(id_mensalidade, aluno_matricula, data_pagamento, data_vencimento, status_mensalidade, valor)VALUES(?,?,?,?,?,?)");
            stmt.setInt(1, Util.geradorDeMatricula());
            stmt.setInt(2, mensalidade.getAluno_matricula());
            stmt.setDate(3, mensalidade.getData_pagamento());
            stmt.setDate(4, mensalidade.getData_vencimento());
            stmt.setBoolean(5, mensalidade.isStatus_mensalidade());
            stmt.setFloat(6, mensalidade.getValor());
            
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConexaoComBD.closeConnection(conexao, stmt);
        }
	
	}

	public List<Mensalidade> getAllMensalidade() throws SQLException {
		
		String sql = "SELECT * FROM mensalidade";
		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;
		List<Mensalidade> listaMensalidades= new ArrayList<>();
        
		try {
            stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
            	listaMensalidades.add(new Mensalidade(rs.getInt(1),rs.getInt(2),rs.getDate(3),rs.getDate(4),rs.getBoolean(5),rs.getFloat(6)));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConexaoComBD.closeConnection(conexao, stmt);
        }
 
		
		
		return listaMensalidades;
		
	}
	
	public void updateMensalidade(Integer id, Mensalidade mensalidade) throws SQLException {
		String sql = "UPDATE INTO funcionario (id_mensalidade, aluno_matricula, data_pagamento, data_vencimento, status_mensalidade, valor)VALUES(" + id + ",?,?,?,?,?) "
					+ "WHERE id_mensalidade = " + id;
		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(2, mensalidade.getAluno_matricula());
			stmt.setDate(3, mensalidade.getData_pagamento());
			stmt.setDate(4, mensalidade.getData_vencimento());
	        stmt.setBoolean(5, mensalidade.isStatus_mensalidade());
	        stmt.setFloat(6, mensalidade.getValor());
	            
	        stmt.executeUpdate();
            
	            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
		} finally {
			ConexaoComBD.closeConnection(conexao, stmt);
		}
	}
	
	public void deleteMensalidade(Integer id) throws SQLException {
		String sql = "DELETE FROM mensalidade WHERE id_mensalidade= " + id;
		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = conexao.prepareStatement(sql);
		} finally {
			ConexaoComBD.closeConnection(conexao, stmt);
		}
	}
}
