package br.com.horacio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import br.com.horacio.beans.Funcionario;

public class FuncionarioDAO {
	private Connection con;

	public FuncionarioDAO(Connection con) {
		setCon(con);
		// TODO Auto-generated constructor stub
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}
	
	public String inserir(Funcionario funcionario)
	{
		String sql = "Insert into funcionario(Nome, Idade, Salario) VALUES(?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, funcionario.getNome());
			ps.setInt(2, funcionario.getIdade());
			ps.setDouble(3, funcionario.getSalario());
			
			if(ps.executeUpdate() > 0)
				return "Inserido com sucesso!!";
			else
				return "Erro ao inserir"; 
				
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public String deleteFuncionario()
	{
		String sql = "Delete from funcionario";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			
			
			if(ps.executeUpdate() > 0)
				return "Deletado com sucesso!!";
			else
				return "Erro ao deletar"; 
				
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public String ModificarComWhere(Funcionario funcionario)
	{
		String sql = "Update funcionario set nome =(?) where idade = (?)" + "";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, funcionario.getNome());
			ps.setInt(2, funcionario.getIdade());
			if(ps.executeUpdate() > 0)
				return "Modificado com sucesso!!";
			else
				return "Erro ao modificar"; 
				
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public String ModificarSemWhere(Funcionario funcionario)
	{
		String sql = "Update funcionario set nome =(?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, funcionario.getNome());
			if(ps.executeUpdate() > 0)
				return "Modificado com sucesso!!";
			else
				return "Erro ao modificar"; 
				
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public String DeletarComWhere(Funcionario funcionario)
	{
		String sql = "Delete from notebook Where Cor = (?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, funcionario.getNome());
			
			if(ps.executeUpdate() > 0)
				return "Deletado com sucesso!!";
			else
				return "Erro ao deletar"; 
				
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
}

