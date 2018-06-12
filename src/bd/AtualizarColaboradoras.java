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

/**
 *
 * @author Usuário
 */
public class AtualizarColaboradoras {
    
    static Connection conexao = null;
    static Statement consulta;
    static ResultSet resultadoDaConsulta;
    static String nomeDaTabela = "Colaboradoras";
    static String servidor = "localhost";
    static String banco = "cliente";
    static String usuario = "root";
    static String senha = "";
    static String url = "jdbc:mysql://" + servidor + "/" + banco;
    
static void atualizar (String id, String nome, int idade, String CPF,String preferencia1, String preferencia2, String preferencia3, String sexo) {
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            PreparedStatement atualizacao = null;
            BD bd = new BD();
            String comando = "UPDATE Colaboradoras SET nome = ?, idade = ?, CPF = ?, preferencia1 = ?, preferencia2 = ?, preferencia3 = ?, sexo = ? WHERE id = " + bd.id ;
            atualizacao = conexao.prepareStatement(comando);
            
            atualizacao.setString(1,nome);
            atualizacao.setInt(2,idade);
            atualizacao.setString(3,CPF);
            atualizacao.setString(4,preferencia1);
            atualizacao.setString(5,preferencia2);
            atualizacao.setString(6,preferencia3);
            atualizacao.setString(7,sexo);
//          atualizacao.setString(8,id);
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
        int idade = bd.idade;
        String CPF = bd.CPF;
        String sexo = bd.sexo;
        String preferencia1 = bd.preferencia1;
        String preferencia2 = bd.preferencia2;
        String preferencia3 = bd.preferencia3;
             
                
       AtualizarColaboradoras.atualizar(id, nome, idade,CPF,preferencia1, preferencia2, preferencia3, sexo);
    }
}
    
