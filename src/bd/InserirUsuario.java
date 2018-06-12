/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import Adm.PesquisaUsuarios;
import static bd.BD.conexao;
import static bd.BD.consulta;
import static bd.BD.nomeDaTabelaUsuario;
import static bd.BD.numAleatorio;
import static bd.BD.senha;
import static bd.BD.url;
import static bd.BD.usuario;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuário
 */
public class InserirUsuario {static void inserir(String nome, String email, String senhaCliente) {
    
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            consulta = conexao.createStatement();
            consulta.executeUpdate("INSERT INTO " + nomeDaTabelaUsuario +
                    "(nome,email, senha)" + " VALUES " +"('" +
                    //numAleatorio.nextInt(10)+1 + "','" +
                    nome + "','" +
                    email + "','" +
                    senhaCliente + "')");

            //PesquisaUsuarios pesquisaUsuarios = new PesquisaUsuarios();
           // pesquisaUsuarios.setVisible(true);

            consulta.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Falha ao inserir dados na tabela!");
        }
}
  public static String InserirUsuario(){
                
        String mensagem = "Usuario cadastrado com sucesso";
              
        String nome = BD.nome;
        String email = BD.clienteEmail;
        String senha = BD.clienteSenha;
         
        
       InserirUsuario.inserir(nome, email, senha);
        
                
        return mensagem;  
    }
}
