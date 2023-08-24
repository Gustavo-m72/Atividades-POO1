/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;


import dados.JogadoresModelo;
import dao.JogadorDao;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class JogadorNegocio {
    public ArrayList consultarJogadores(String nomePesquisar) throws SQLException{
        
        JogadorDao dao = new JogadorDao();
        ArrayList<JogadoresModelo> minhaLista = dao.consultar(nomePesquisar); 
        return minhaLista;
        
    }
    
    public void inserirJogadores(String time, String nome, int idade, int numerodegols,int numerocamisa, String posicao,int titular) throws SQLException{
        JogadoresModelo jogadores = new JogadoresModelo();
        
        jogadores.setTime(time);
        jogadores.setNome(nome);
        jogadores.setIdade(idade);
        jogadores.setNumerodegols(numerodegols);
        jogadores.setNumerocamisa(numerocamisa);
        jogadores.setPosicao(posicao);
        jogadores.setTitular(titular);
        
        JogadorDao dao = new JogadorDao();
        
        dao.inserir(jogadores);
        
        JOptionPane.showMessageDialog(null, "Cadastro inserido com Sucesso");
    }


    public void alterarJogadores(String id,String time,String nome, int idade, int numerodegols,int numerocamisa, String posicao,int titular) throws SQLException{

        JogadoresModelo jogadores = new JogadoresModelo();
        jogadores.setId(Integer.parseInt(id));
        jogadores.setTime(time);
        jogadores.setNome(nome);
        jogadores.setIdade(idade);
        jogadores.setNumerodegols(numerodegols);
        jogadores.setNumerocamisa(numerocamisa);
        jogadores.setPosicao(posicao);
        jogadores.setTitular(titular);
        
        JogadorDao dao = new JogadorDao();
        
        dao.alterar(jogadores);
        
        JOptionPane.showMessageDialog(null, "Cadastro alterado com Sucesso");
     
     
    }

    
    public void removerJogadores(String id) throws SQLException{
        
        JogadoresModelo jogadores = new JogadoresModelo();
        jogadores.setId(Integer.parseInt(id));
        
        JogadorDao dao = new JogadorDao();
        
        dao.remover(jogadores);
        
        JOptionPane.showMessageDialog(null, "Cadastro removido com Sucesso");
    
    
    }
    
     public void localizaPrimeiroJogador(JogadoresModelo referenciaJogador) throws SQLException{
       
         JogadorDao dao = new JogadorDao();
         
         dao.localizarPrimeiroAtleta(referenciaJogador);
         
     }
     
     
     public void localizaProximoJogador(JogadoresModelo referenciaJogador, String id) throws SQLException{
       
         JogadorDao dao = new JogadorDao();
         
         dao.localizarProximoAtleta(referenciaJogador, id);
         
     }
     
     
     public void localizaUltimoJogador (JogadoresModelo referenciaJogador) throws SQLException{
       
         JogadorDao dao = new JogadorDao();
         
         dao.localizaUltimoAtleta(referenciaJogador);
         
     }
     
     
     public void localizaJogadorAnterior(JogadoresModelo referenciaJogadores, String id) throws SQLException{
       
         JogadorDao dao = new JogadorDao();
         
         dao.localizaAtletaAnterior(referenciaJogadores,id);
         
     }
     
     
     public void localizaJogadorCadastro(JogadoresModelo referenciaJogadores, String id) throws SQLException{
       
         JogadorDao dao = new JogadorDao();
         
         dao.localizarAtletaConsulta(referenciaJogadores,id);
         
     }
     
}
