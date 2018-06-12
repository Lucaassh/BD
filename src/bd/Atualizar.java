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
public class Atualizar {
    
    static Connection conexao = null;
    static Statement consulta;
    static ResultSet resultadoDaConsulta;
    static String nomeDaTabela = "clientes";
    static String servidor = "localhost";
    static String banco = "cliente";
    static String usuario = "root";
    static String senha = "";
    static String url = "jdbc:mysql://" + servidor + "/" + banco;
    
static void atualizar (String id, String nome, int idade, String CPF, String email, String clienteSenha, String sexo) {
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            PreparedStatement atualizacao = null;
            BD bd = new BD();
            String comando = "UPDATE clientes SET nome = ?, idade = ?, CPF = ?, email = ?, senha = ?, sexo = ? WHERE id = " + bd.id ;
            atualizacao = conexao.prepareStatement(comando);
//            atualizacao.setString(1,id);
            atualizacao.setString(1,nome);
            atualizacao.setInt(2, idade);
            atualizacao.setString(3, CPF);
            atualizacao.setString(4,email);
            atualizacao.setString(5, clienteSenha);
            atualizacao.setString(6, sexo);
            atualizacao.executeUpdate();

          
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Falha ao alterar dados na tabela!");
        }
    }

    public static void atualizar(){
        Scanner escreva = new Scanner(System.in);
        BD bd = new BD();
        
       
        String id = bd.id;
        String nome = bd.nome;
        int idade = bd.idade;
        String CPF = bd.CPF;
        String email = bd.clienteEmail;
        String clienteSenha = bd.clienteSenha;
        String sexo = bd.sexo;
             
                
       Atualizar.atualizar(id, nome, idade, CPF, email,clienteSenha, sexo);
    }
}
