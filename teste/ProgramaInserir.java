package br.com.horacio.teste;

import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.horacio.beans.Funcionario;
import br.com.horacio.conexao.Conexao;
import br.com.horacio.conexao.ConexaoDAO;
import br.com.horacio.dao.FuncionarioDAO;

public class ProgramaInserir {

	public static void main(String[] args) throws Exception {
		Connection con = ConexaoDAO.abrirConexao();
		
		Funcionario funcionario = new Funcionario();
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO(con); 
		
		funcionario.setNome(JOptionPane.showInputDialog("Digite o nome do funcionario"));
		funcionario.setIdade (Integer.parseInt(JOptionPane.showInputDialog("Quantos anos voce têm")));
		funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario")));
			
		System.out.println(funcionarioDAO.inserir(funcionario)); 
		
		Conexao.fecharConexao(con);

	}

}
