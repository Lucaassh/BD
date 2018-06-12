/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import static bd.BD.conexao;
import static bd.BD.consulta;
import static bd.BD.nomeDaTabelaColaboradorasPreferencial3;
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
public class InserirPreferencia3 {static void inserir(String nome, int idade, String CPF, String preferencia3,String sexo ) {
    
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            consulta = conexao.createStatement();
            consulta.executeUpdate("INSERT INTO " + nomeDaTabelaColaboradorasPreferencial3 +
                    "(nome, idade, CPF, preferencia3,sexo)" + " VALUES " +"('" +
                     //numAleatorio.nextInt(100)+1 + "','" +
                    nome + "','" +
                    idade + "','" + 
                    CPF + "','" +
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
    
 

        public static String InserirPreferencial3(){
                
        String mensagem = "Usuario cadastrado com sucesso";
              
        String nome = BD.nome;
        String preferencia3 = BD.preferencia3;
        String sexo = BD.sexo;
        int idade = BD.idade ;
        String CPF = BD.CPF;
        
        
        InserirPreferencia3.inserir(nome, idade, CPF, preferencia3,sexo);
                
        return mensagem;
       
 }
               
 }




    
