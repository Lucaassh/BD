package bd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.Random;
import p69.TelaLogin;

public class BD  {

    static Connection conexao = null;
    static Statement consulta;
    static ResultSet resultadoDaConsulta;
    static String nomeDaTabelaColaboradoras = "Colaboradoras";
    static String nomeDaTabelaColaboradorasPreferencial1 = "Colaboradoraspreferencial1";
    static String nomeDaTabelaColaboradorasPreferencial2 = "Colaboradoraspreferencial2";
    static String nomeDaTabelaColaboradorasPreferencial3 = "Colaboradoraspreferencial3";
    static String nomeDaTabelaClientes = "Clientes";
    static String nomeDaTabelaUsuario = "usuario";
    static String servidor = "localhost";
    static String banco = "cliente";
    static String usuario = "root";
    static String senha = "";
    static String url = "jdbc:mysql://" + servidor + "/" + banco;
    static String filme, genero;
    public static String nome = "Lucas Pedro" , sexo, sexoCola;
    public static String clienteEmail, clienteSenha, CPF;
    public static int idade, idadeCola;
    public static String id, idCola;
    public static String nomeCola;
    public static String idd;
    public static String preferenciaCola;
    public static String preferencia1 = " - ";
    public static String preferencia2 = " - ";
    public static String preferencia3 = " - ";
    static Random numAleatorio = new Random();

    public static void main(String[] args) {  
        
          
    
     
        
        TelaLogin telaLogin = new TelaLogin();
       telaLogin.setVisible(true);   
        
       
             
        }
         

}

    
    
