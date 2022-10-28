package br.com.horacio.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//	!!! SERVE PARA TESTAR A CONEXÃO COM O BANCO !!!
public class ConexaoFactory {

	public Connection getConnection() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		
		return DriverManager.getConnection("jdbc:mysql://localhost:3307","root","*123456HAS*");
	}

}

