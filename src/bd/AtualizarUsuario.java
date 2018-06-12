/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public class AtualizarUsuario {
    
    static Connection conexao = null;
    static Statement consulta;
    static ResultSet resultadoDaConsulta;
    static String nomeDaTabela = "clientes";
    static String servidor = "localhost";
    static String banco = "cliente";
    static String usuario = "root";
    static String senha = "";
    static String url = "jdbc:mysql://" + servidor + "/" + banco;
    
static void atualizar (String id, String nome, String email, String clienteSenha) {
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            PreparedStatement atualizacao = null;
            BD bd = new BD();
            String comando = "UPDATE usuario SET nome = ?, email = ?, senha = ? WHERE id = " + bd.id ;
            atualizacao = conexao.prepareStatement(comando);
//            atualizacao.setString(1,id);
            atualizacao.setString(1,nome);
            atualizacao.setString(2,email);
            atualizacao.setString(3,clienteSenha);
            atualizacao.executeUpdate();
            
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Falha ao alterar dados na tabela!");
        }
    }

    public static void atualizar(){
        
        BD bd = new BD();
        
        String id = bd.id;
        String nome = bd.nome;
        String email = bd.clienteEmail;
        String clienteSenha = bd.clienteSenha;
             
                
       AtualizarUsuario.atualizar(id,nome, email, clienteSenha);
    }
}
