/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import static bd.BD.conexao;
import static bd.BD.consulta;
import static bd.BD.numAleatorio;
import static bd.BD.senha;
import static bd.BD.url;
import static bd.BD.usuario;
import static bd.CriarTabela.nomeDaTabelaColaboradoras;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author Usuário
 */
public class InserirColaboradoras {static void inserir(String nome, int idade, String CPF, String preferencia1, String preferencia2,String preferencia3, String sexo ) {
    
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            consulta = conexao.createStatement();
            consulta.executeUpdate("INSERT INTO " + nomeDaTabelaColaboradoras +
                    "(nome, idade, CPF, preferencia1, preferencia2,preferencia3, sexo)" + " VALUES " +"('" +
                     //numAleatorio.nextInt(10)+1 + "','" +
                    nome + "','" +
                    idade + "','" + 
                    CPF + "','" +
                    preferencia1 + "','" +
                    preferencia2 + "','" +
                    preferencia3 + "','" +
                    sexo + "')");

            

            consulta.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Falha ao inserir dados na tabela!");
        }
}




    public String nome;
    public int idade;
    
 

        public static String InserirColaboradora(){
                
        String mensagem = "Usuario cadastrado com sucesso";
              
        String nome = BD.nome;
        String preferencia1 = BD.preferencia1;
        String preferencia2 = BD.preferencia2;
        String preferencia3 = BD.preferencia3;
        String sexo = BD.sexo;
        int idade = BD.idade ;
        String CPF = BD.CPF;
        
        
        InserirColaboradoras.inserir(nome, idade, CPF, preferencia1, preferencia2, preferencia3, sexo);
                
        return mensagem;
       
 }
               
 }




    
