package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import conexao.ConexaoComBD;
import model.Funcionario;
import util.Util;

public class FuncionarioDAO {
	
	public void cadastrarFuncionario(Funcionario funcionario) {
		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;

        try {
            stmt = conexao.prepareStatement("INSERT INTO funcionario (matricula, cpf, pis, nome, sobrenome, sexo, data_nascimento, turno, salario_bruto, id_cargo)VALUES(?,?,?,?,?,?,?,?,?,W)");
            stmt.setInt(1, Util.geradorDeMatricula());
            stmt.setString(2, funcionario.getCpf());
            stmt.setString(3, funcionario.getPis());
            stmt.setString(4, funcionario.getNome());
            stmt.setString(5, funcionario.getSobrenome());
            stmt.setString(6, funcionario.getSexo());
            stmt.setDate(7, funcionario.getData_nascimento());
            stmt.setString(8, funcionario.getTurno());
            stmt.setFloat(9, funcionario.getSalario_bruto());
            stmt.setInt(10, funcionario.getCargo());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConexaoComBD.closeConnection(conexao, stmt);
        }
	
	}

	public List<Funcionario> getAllFuncionario() throws SQLException {
		
		String sql = "SELECT * FROM funcionario";
		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;
		List<Funcionario> listaFuncionarios = new ArrayList<>();
        
		try {
            stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
            	listaFuncionarios.add(new Funcionario(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getString(8),rs.getFloat(9),rs.getInt(10)));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConexaoComBD.closeConnection(conexao, stmt);
        }
 
		
		
		return listaFuncionarios;
		
	}
	public static String getNomeCargo(Integer matricula ) {
		String sql = "SELECT c.nome FROM funcionario f JOIN cargo_funcionario c ON f.id_cargo = c.id_cargo WHERE f.matricula = ?";
		Connection conexao = ConexaoComBD.getConnection();
		PreparedStatement stmt = null;
		try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, matricula);
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()) {
            	return rs.getString(1);
            }
           
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConexaoComBD.closeConnection(conexao, stmt);
        }
 
		
		return null;}
	
	public FuncionarioDAO() {
		
	}
	
	
}
