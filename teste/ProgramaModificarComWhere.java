package br.com.horacio.teste;

import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.horacio.beans.Funcionario;
import br.com.horacio.conexao.Conexao;
import br.com.horacio.conexao.ConexaoDAO;
import br.com.horacio.dao.FuncionarioDAO;

public class ProgramaModificarComWhere {
	
	public static void main(String[] args) throws Exception {
Connection con = ConexaoDAO.abrirConexao();
		
		Funcionario funcionario = new Funcionario();
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO(con); 
		
		funcionario.setNome(JOptionPane.showInputDialog("Digite o nome"));
		funcionario.setIdade (Integer.parseInt(JOptionPane.showInputDialog("Digite a idade")));
			
		System.out.println(funcionarioDAO.ModificarComWhere(funcionario)); 
		
		Conexao.fecharConexao(con);

	}

}
