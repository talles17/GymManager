package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import conexao.ConexaoComBD;
import model.Credencial;

public class CredencialDAO {
	
	private Integer matricula;
	
	public void cadastrarCredencial(Credencial credencial) {
		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;

        try {
            stmt = conexao.prepareStatement("INSERT INTO credencial (funcionario_matricula,login,senha)VALUES(?,?,?)");
            stmt.setInt(1, credencial.getFuncionario_matricula());
            stmt.setString(2, credencial.getLogin());
            stmt.setString(3,credencial.getSenha());

            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConexaoComBD.closeConnection(conexao, stmt);
        }

		
	}
	
	public List<Credencial> getAllCredenciais() throws SQLException {
		
		String sql = "SELECT * FROM credencial";
		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;
		List<Credencial> listaCredenciais= new ArrayList<>();
        
		try {
            stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
            	listaCredenciais.add(new Credencial(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4)));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConexaoComBD.closeConnection(conexao, stmt);
        }
 
		
		
		return listaCredenciais;
		
	}


	public void updateCredencial(Integer id, Credencial credencial) throws SQLException {
		String sql = "UPDATE INTO credencial (id_credencial, funcionario_matricula, login, senha)VALUES(" + id + ",?,?,?) "
					+ "WHERE id_credencial = " + id;
		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(2, credencial.getFuncionario_matricula());
            stmt.setString(3, credencial.getLogin());
            stmt.setString(4, credencial.getSenha());
           

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
		} finally {
			ConexaoComBD.closeConnection(conexao, stmt);
		}
	}
	

	public void deleteCredencial(Integer id) throws SQLException {
		String sql = "DELETE FROM credencial WHERE id_credencial = " + id;
		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = conexao.prepareStatement(sql);
		} finally {
			ConexaoComBD.closeConnection(conexao, stmt);
		}
	}
	
	public boolean loginCheck(String login, String senha) {

		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;
		String sql = "SELECT * FROM credencial WHERE login = ? AND senha = ?;";
		
		try {
			
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, login);
			stmt.setString(2, senha);
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				this.matricula = rs.getInt(2); 
				return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ConexaoComBD.closeConnection(conexao, stmt);
		}
		return false;
	}
	
	public Integer getMatricula() {
		return this.matricula;
	}
	
}
