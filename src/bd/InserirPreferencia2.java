/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import static bd.BD.conexao;
import static bd.BD.consulta;
import static bd.BD.nomeDaTabelaColaboradorasPreferencial2;
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
public class InserirPreferencia2 {static void inserir(String nome, int idade, String CPF, String preferencia2,String sexo ) {
    
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            consulta = conexao.createStatement();
            consulta.executeUpdate("INSERT INTO " + nomeDaTabelaColaboradorasPreferencial2 +
                    "(nome, idade, CPF, preferencia2,sexo)" + " VALUES " +"('" +
                    // numAleatorio.nextInt(100)+1 + "','" +
                    nome + "','" +
                    idade + "','" + 
                    CPF + "','" +
                    preferencia2 + "','" +
                    sexo + "')");

            

            consulta.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Falha ao inserir dados na tabela!");
        }
}

    public String nome;
    public int idade;
    
 

        public static String InserirPreferencial2(){
                
        String mensagem = "Usuario cadastrado com sucesso";
              
        String nome = BD.nome;
        String preferencia2 = BD.preferencia2;
        String sexo = BD.sexo;
        int idade = BD.idade ;
        String CPF = BD.CPF;
        
        
        InserirPreferencia2.inserir(nome, idade, CPF, preferencia2,sexo);
                
        return mensagem;
       
 }
               
 }




    
