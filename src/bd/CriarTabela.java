/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import Adm.PesquisaColaboradoras;
import static bd.BD.conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Usuário
 */
public class CriarTabela {
    
        static Connection conexao = null;
    static Statement consulta;
    static ResultSet resultadoDaConsulta;
    static String nomeDaTabelaColaboradoras = "Colaboradoras";
    static String nomeDaTabelaClientes = "Clientes";
    static String servidor = "localhost";
    static String banco = "cliente";
    static String usuario = "root";
    static String senha = "";
    static String url = "jdbc:mysql://" + servidor + "/" + banco;
    
    static void criarTabelaColaboradoras () {
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            consulta = conexao.createStatement();
            consulta.executeUpdate("CREATE TABLE Colaboradoras" +
                                  
                                   "(nome VARCHAR(100) not NULL, " +
                                   "idade INT(10)not NULL, " +
                                   "CPF VARCHAR(100)not NULL, " +
                                   "preferencia1 VARCHAR(100), " +
                                   "preferencia2 VARCHAR(100), " +
                                   "preferencia3 VARCHAR(100), " +
                                   "sexo VARCHAR(100)not NULL, " +  
                                   "id INTEGER(5) not NULL, " +
                                   "PRIMARY KEY (Id))");

            PesquisaColaboradoras pesquisaColaboradoras = new PesquisaColaboradoras();
            pesquisaColaboradoras.setVisible(true);

            consulta.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Falha ao inserir dados na tabela Colaboradoras!");
        }
    }
     static void criarTabelaUsuario () {
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            consulta = conexao.createStatement();
            consulta.executeUpdate("CREATE TABLE Usuario" +
                                  
                                   "(nome VARCHAR(100)not NULL, " +
                                   "email VARCHAR(100)not NULL, " +
                                   "senha VARCHAR(100)not NULL, " +
                                   "id INTEGER(5) not NULL, " +
                                   "PRIMARY KEY (id))");

           
            consulta.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Falha ao inserir dados na tabela Usuario!");
        }
    }
     static void criarTabelaClientes () {
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            consulta = conexao.createStatement();
            consulta.executeUpdate("CREATE TABLE Clientes" +
                                   
                                   "(nome VARCHAR(100) not NULL, " +
                                   "idade INT(10)not NULL, " +
                                   "CPF VARCHAR(100)not NULL, " +
                                   "email VARCHAR(100)not NULL, " +
                                   "senha VARCHAR(100)not NULL, " +
                                   "sexo VARCHAR(100)not NULL, " + 
                                  "id INTEGER(5) not NULL, " +
                                   "PRIMARY KEY (Id))");

           
            consulta.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Falha ao inserir dados na tabela Clientes!");
        }
    }
static void criarTabelaPreferencia1 () {
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            consulta = conexao.createStatement();
            consulta.executeUpdate("CREATE TABLE ColaboradorasPreferencial1" +
                                   "(id INTEGER(5) not NULL, " +
                                   "nome VARCHAR(100) not NULL, " +
                                   "idade INT(10)not NULL, " +
                                   "CPF VARCHAR(100)not NULL, " +
                                   "preferencia1 VARCHAR(100), " +
                                   "sexo VARCHAR(100)not NULL, " +                                                      
                                   "PRIMARY KEY (Id))");

            consulta.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Falha ao inserir dados na tabela Colaboradoras!");
        }
        
     }
        
static void criarTabelaPreferencia2 () {
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            consulta = conexao.createStatement();
            consulta.executeUpdate("CREATE TABLE ColaboradorasPreferencial2" +
                                   "(id INTEGER(5) not NULL, " +
                                   "nome VARCHAR(100) not NULL, " +
                                   "idade INT(10)not NULL, " +
                                   "CPF VARCHAR(100)not NULL, " +
                                   "preferencia2 VARCHAR(100), " +
                                   "sexo VARCHAR(100)not NULL, " +                                                      
                                   "PRIMARY KEY (Id))");

            consulta.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Falha ao inserir dados na tabela Colaboradoras!");
        }
    }
static void criarTabelaPreferencia3 () {
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            consulta = conexao.createStatement();
            consulta.executeUpdate("CREATE TABLE ColaboradorasPreferencial3" +
                                   "(id INTEGER(5) not NULL, " +
                                   "nome VARCHAR(100) not NULL, " +
                                   "idade INT(10)not NULL, " +
                                   "CPF VARCHAR(100)not NULL, " +
                                   "preferencia3 VARCHAR(100), " +
                                   "sexo VARCHAR(100)not NULL, " +                                                      
                                   "PRIMARY KEY (Id))");

            consulta.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Falha ao inserir dados na tabela Colaboradoras!");
        }
    }
     
    
}
