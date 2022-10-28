package br.com.horacio.teste;

import java.sql.Connection;

import br.com.horacio.conexao.Conexao;
import br.com.horacio.conexao.ConexaoDAO;
import br.com.horacio.dao.FuncionarioDAO;

public class ProgramaDeletarSemWhere {

	public static void main(String[] args) throws Exception {
Connection con = ConexaoDAO.abrirConexao();
		
		FuncionarioDAO funcionariodao = new FuncionarioDAO(con); 
		
		System.out.println(funcionariodao.deleteFuncionario());
		//System.out.println(Deletarnotebookcomwhere.deletePeso(notebook));
		//System.out.println(Deletarnotebookcomwhere.deleteTamanhoTela(notebook));
		
		Conexao.fecharConexao(con);

	}

}
