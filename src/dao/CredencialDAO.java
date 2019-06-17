package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
