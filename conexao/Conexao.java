package br.com.horacio.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	

	//public static Connection abrirConexao() throws Exception{
	public static void main(String[] args) throws SQLException {
		Connection con = null;

		String url = "jdbc:mysql://localhost:3307";
		final String USER = "root";
		final String PASS = "*123456HAS*";
		con = DriverManager.getConnection(url, USER, PASS);
		System.out.println("Conexão aberta.");
		fecharConexao(con);
		
	}

	public static void fecharConexao(Connection con) {
		try {
			con.close();
			System.out.println("Conexão fechada.");
		} catch (SQLException e) {
			System.out.println(e.getMessage() + " Erro no envio dos dados");
		}
	}

}
