/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

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
public class Conectar {
    
    static Connection conexao = null;
    static Statement consulta;
    static ResultSet resultadoDaConsulta;
    static String nomeDaTabela = "Colaboradoras";
    static String servidor = "localhost";
    static String banco = "cliente";
    static String usuario = "root";
    static String senha = "";
    static String url = "jdbc:mysql://" + servidor + "/" + banco;
    
    static void testeDoDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Driver instalado corretamente.");
        } catch (Exception e) {
            System.out.println("Falha no teste do driver!");
            e.printStackTrace();
        }
    }

    static void testeDaConexao() {
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexao com o banco realizada com sucesso.");
        } catch (Exception e) {
            System.out.println("Falha durante o teste de conexão!");
            e.printStackTrace();
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                    System.out.println("Conexão com o banco encerrada com sucesso.");
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("Falha no encerramento da conexão com o banco!");
                }
            }
        }
    }
    
}
