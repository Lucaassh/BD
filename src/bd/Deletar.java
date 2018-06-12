/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import Adm.PesquisaColaboradoras;
import Adm.PesquisaUsuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import p69.PesquisaClientes;

/**
 *
 * @author Usuário
 */
public class Deletar {
    
    static Connection conexao = null;
    static Statement consulta;
    static ResultSet resultadoDaConsulta;
    static String nomeDaTabelaColaboradoras = "Colaboradoras";
    static String servidor = "localhost";
    static String banco = "cliente";
    static String usuario = "root";
    static String senha = "";
    static String url = "jdbc:mysql://" + servidor + "/" + banco;
    
    static void apagaColaboradoras (String id) {
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            PreparedStatement delecao = null;
            String comando = "DELETE FROM Colaboradoras WHERE Id = ?";
            delecao = conexao.prepareStatement(comando);
            delecao.setString(1,id);
            delecao.executeUpdate();

            PesquisaColaboradoras pesquisaColaboradoras = new PesquisaColaboradoras();
            pesquisaColaboradoras.setVisible(true);

            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Falha ao alterar dados na tabela!");
        }
    }
        static void apagaColaboradoras1 (String cpf) {
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            PreparedStatement delecao = null;
            String comando = "DELETE FROM colaboradoraspreferencial1 WHERE CPF = ?";
            delecao = conexao.prepareStatement(comando);
            delecao.setString(1,cpf);
            delecao.executeUpdate();

//            PesquisaColaboradoras pesquisaColaboradoras = new PesquisaColaboradoras();
//            pesquisaColaboradoras.setVisible(true);

            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Falha ao alterar dados na tabela!");
        }
   }
        static void apagaColaboradoras2 (String cpf) {
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            PreparedStatement delecao = null;
            String comando = "DELETE FROM colaboradoraspreferencial2 WHERE CPF = ?";
            delecao = conexao.prepareStatement(comando);
            delecao.setString(1,cpf);
            delecao.executeUpdate();

//            PesquisaColaboradoras pesquisaColaboradoras = new PesquisaColaboradoras();
//            pesquisaColaboradoras.setVisible(true);

            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Falha ao alterar dados na tabela!");
        }
   }
        static void apagaColaboradoras3 (String cpf) {
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            PreparedStatement delecao = null;
            String comando = "DELETE FROM colaboradoraspreferencial3 WHERE CPF = ?";
            delecao = conexao.prepareStatement(comando);
            delecao.setString(1,cpf);
            delecao.executeUpdate();

//            PesquisaColaboradoras pesquisaColaboradoras = new PesquisaColaboradoras();
//            pesquisaColaboradoras.setVisible(true);

            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Falha ao alterar dados na tabela!");
        }
    } 
    static void apagaUsuario (String id) {
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            PreparedStatement delecao = null;
            String comando = "DELETE FROM Usuario WHERE Id = ?";
            delecao = conexao.prepareStatement(comando);
            delecao.setString(1,id);
            delecao.executeUpdate();
            
//            PesquisaUsuarios pesquisaUsuarios = new PesquisaUsuarios();
//            pesquisaUsuarios.setVisible(true);
            

            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Falha ao alterar dados na tabela!");
        }
    } 
    
        static void apagaClientes (String id) {
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            PreparedStatement delecao = null;
            String comando = "DELETE FROM Clientes WHERE Id = ?";
            delecao = conexao.prepareStatement(comando);
            delecao.setString(1,id);
            delecao.executeUpdate();

//            PesquisaClientes pesquisaClientes = new PesquisaClientes();
//            pesquisaClientes.setVisible(true);

            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Falha ao alterar dados na tabela!");
        }
    } 
        public static void apagarUsuario(){

        BD bd = new BD();
                
        String id = bd.id;
        
        Deletar.apagaUsuario(id);
    }
        public static void apagarCliente(){
   
        BD bd = new BD();
                
        String id = bd.id;
        
        Deletar.apagaClientes(id);
    }
    
    public static void apagarColaboradora(){

        BD bd = new BD();
                
        String id = bd.id;
        
        Deletar.apagaColaboradoras(id);
    }
    
    public static void apagarColaboradora1(){
  
        BD bd = new BD();
                
        String CPF = bd.CPF;
        
        Deletar.apagaColaboradoras1(CPF);
    }
     public static void apagarColaboradora2(){

        BD bd = new BD();
                
        String CPF = bd.CPF;
        
        Deletar.apagaColaboradoras2(CPF);
    }
     public static void apagarColaboradora3(){

        BD bd = new BD();
                
        String CPF = bd.CPF;
        
        Deletar.apagaColaboradoras3(CPF);
    }
}
