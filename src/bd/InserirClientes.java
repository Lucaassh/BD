/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import static bd.BD.CPF;
import static bd.BD.conexao;
import static bd.BD.consulta;
import static bd.BD.numAleatorio;
import static bd.BD.senha;
import static bd.BD.url;
import static bd.BD.usuario;
import static bd.CriarTabela.nomeDaTabelaClientes;
import static bd.CriarTabela.nomeDaTabelaColaboradoras;
import static bd.InserirClientes.InserirCliente;
import java.sql.DriverManager;
import java.sql.SQLException;
import p69.PesquisaClientes;

/**
 *
 * @author Usuário
 */
public class InserirClientes {static void inserir(String nome, int idade, String CPF, String email, String senhaCliente, String sexo ) {
    
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            consulta = conexao.createStatement();
            consulta.executeUpdate("INSERT INTO " + nomeDaTabelaClientes +
                    "(nome, idade, CPF, email, senha, sexo)" + " VALUES " +"('" +
                    //numAleatorio.nextInt(10)+1 + "','" +
                    nome + "','" +
                    idade + "','" + 
                    CPF + "','" +
                    email + "','" +
                    senhaCliente + "','" +
                    sexo + "')");

            //PesquisaClientes pesquisaClientes = new PesquisaClientes();
            //pesquisaClientes.setVisible(true);

            consulta.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Falha ao inserir dados na tabela!");
        }
}
    
    
    public static String InserirCliente(){
                
        String mensagem = "Usuario cadastrado com sucesso";
              
        String nome = BD.nome;
        String email = BD.clienteEmail;
        String senha = BD.clienteSenha;
        String sexo = BD.sexo;
        int idade = BD.idade ;
        String CPF = BD.CPF;
        
        
        InserirClientes.inserir(nome, idade, CPF, email, senha, sexo);
        
                
        return mensagem;
       
 }
    
}
