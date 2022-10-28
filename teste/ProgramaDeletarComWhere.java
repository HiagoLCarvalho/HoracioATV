package br.com.horacio.teste;

import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.horacio.beans.Funcionario;
import br.com.horacio.conexao.Conexao;
import br.com.horacio.conexao.ConexaoDAO;
import br.com.horacio.dao.FuncionarioDAO;

public class ProgramaDeletarComWhere {
	
	public static void main(String[] args) throws Exception {
		Connection con = ConexaoDAO.abrirConexao();
		
		Funcionario funcionario = new Funcionario();
		FuncionarioDAO funcionariodao = new FuncionarioDAO(con); 
		
		funcionario.setNome(JOptionPane.showInputDialog("Digite o nome a ser deletado"));
		
		System.out.println();
		System.out.println(funcionariodao.DeletarComWhere(funcionario));
		//System.out.println(Deletarnotebookcomwhere.deletePeso(notebook));
		//System.out.println(Deletarnotebookcomwhere.deleteTamanhoTela(notebook));
		
		Conexao.fecharConexao(con);

	}
}
