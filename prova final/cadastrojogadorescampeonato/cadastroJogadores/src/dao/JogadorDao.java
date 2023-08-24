/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;



import dados.JogadoresModelo;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class JogadorDao {
    
    private Connection conexao = null;
    
    public JogadorDao() throws SQLException{
        this.conexao = new ConexaoDao().getConexao();
    }
    
    
    public ArrayList<JogadoresModelo> consultar(String nomePesquisar) throws SQLException{
        
        String sql = "select * from jogadores.atleta where nome like?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nomePesquisar);
        
        ResultSet rs = stmt.executeQuery();
        
        ArrayList<JogadoresModelo> minhaLista = new ArrayList<JogadoresModelo>();
        
        while(rs.next()){
            JogadoresModelo jogador = new JogadoresModelo();
            jogador.setId(rs.getInt("id"));
            jogador.setTime(rs.getString("time"));
            jogador.setNome(rs.getString("nome"));
            jogador.setIdade(rs.getInt("idade"));
            jogador.setNumerodegols(rs.getInt("numerodegols"));
            jogador.setNumerocamisa(rs.getInt("numerocamisa"));
            jogador.setPosicao(rs.getString("posicao"));
            jogador.setTitular(rs.getInt("titular"));
            
            minhaLista.add(jogador);
        }
        
        rs.close();
        stmt.close();
        conexao.close();
        return minhaLista;
    }
    
    
    public void inserir(JogadoresModelo jogadores) throws SQLException{
        String sql = "insert into atleta(time, nome, idade, numerodegols, numerocamisa, posicao, titular)" + "values(?,?,?,?,?,?,?)";
       try (PreparedStatement stmt = conexao.prepareStatement(sql)){
        stmt.setString(1,jogadores.getTime());
        stmt.setString(2,jogadores.getNome());
        stmt.setInt(3, jogadores.getIdade());
        stmt.setInt(4,jogadores.getNumerodegols());
        stmt.setInt(5, jogadores.getNumerocamisa());
        stmt.setString(6, jogadores.getPosicao());
        stmt.setInt(7, jogadores.getTitular());
        stmt.execute();
    }
    conexao.close();    
    }
    
    public void alterar(JogadoresModelo jogadores) throws SQLException{
    
        String sql = "update atleta set time=?, nome=?, idade=?, numerodegols=?, numerocamisa=?, posicao=?, titular=? where atleta.id=?";
       try (PreparedStatement stmt = conexao.prepareStatement(sql)){
        stmt.setInt(8,jogadores.getId());
        stmt.setString(1,jogadores.getTime());
        stmt.setString(2,jogadores.getNome());
        stmt.setInt(3, jogadores.getIdade());
        stmt.setInt(4,jogadores.getNumerodegols());
        stmt.setInt(5, jogadores.getNumerocamisa());
        stmt.setString(6, jogadores.getPosicao());
        stmt.setInt(7, jogadores.getTitular());
        stmt.execute();
        stmt.close();
    }
    conexao.close();
 
    }
    
    public void remover(JogadoresModelo jogadores) throws SQLException{
        
    String sql = "delete from atleta where id=?";
    
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        stmt.setInt(1, jogadores.getId());
        
        stmt.execute();
        stmt.close();
        conexao.close();
    }

    
    public void localizarPrimeiroAtleta(JogadoresModelo jogador) throws SQLException{
    String sql = "select * from atleta";

    Statement stmt = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
    ResultSet rs = stmt.executeQuery(sql); 
            rs.first();
            jogador.setId(rs.getInt("id"));
            jogador.setNome(rs.getString("nome"));
            jogador.setTime(rs.getString("time"));
            jogador.setIdade(rs.getInt("idade"));
            jogador.setNumerodegols(rs.getInt("numerodegols"));
            jogador.setNumerocamisa(rs.getInt("numerocamisa"));
            jogador.setPosicao(rs.getString("posicao"));
            jogador.setTitular(rs.getInt("titular"));
            rs.close();
            stmt.close();
            conexao.close();
    }

    
    public void localizarProximoAtleta(JogadoresModelo jogador, String id) throws SQLException{
        String sql = "select * from atleta";
        
        Statement stmt = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmt.executeQuery(sql); 
            rs.absolute(Integer.valueOf(id));
            if(rs.isLast()){
                JOptionPane.showMessageDialog(null, "último registro");
            }else{
                rs.next();
                jogador.setId(rs.getInt("id"));
                jogador.setNome(rs.getString("nome"));
                jogador.setTime(rs.getString("time"));
                jogador.setIdade(rs.getInt("idade"));
                jogador.setNumerodegols(rs.getInt("numerodegols"));
                jogador.setNumerocamisa(rs.getInt("numerocamisa"));
                jogador.setPosicao(rs.getString("posicao"));
                jogador.setTitular(rs.getInt("titular")); 
            }
            
            rs.close();
            stmt.close();
            conexao.close();
    }

    
    
        public void localizarAtletaConsulta(JogadoresModelo jogador, String id) throws SQLException{
        String sql = "select * from atleta";
        
        Statement stmt = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmt.executeQuery(sql); 
            rs.absolute(Integer.valueOf(id));

                jogador.setId(rs.getInt("id"));
                jogador.setNome(rs.getString("nome"));
                jogador.setTime(rs.getString("time"));
                jogador.setIdade(rs.getInt("idade"));
                jogador.setNumerodegols(rs.getInt("numerodegols"));
                jogador.setNumerocamisa(rs.getInt("numerocamisa"));
                jogador.setPosicao(rs.getString("posicao"));
                jogador.setTitular(rs.getInt("titular")); 
            
            rs.close();
            stmt.close();
            conexao.close();
    }
    
    
    public void localizaUltimoAtleta(JogadoresModelo jogador) throws SQLException{
    
    String sql = "select * from atleta";

    Statement stmt = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
    ResultSet rs = stmt.executeQuery(sql); 
            rs.last();
            jogador.setId(rs.getInt("id"));
            jogador.setNome(rs.getString("nome"));
            jogador.setTime(rs.getString("time"));
            jogador.setIdade(rs.getInt("idade"));
            jogador.setNumerodegols(rs.getInt("numerodegols"));
            jogador.setNumerocamisa(rs.getInt("numerocamisa"));
            jogador.setPosicao(rs.getString("posicao"));
            jogador.setTitular(rs.getInt("titular")); 
            rs.close();
            stmt.close();
            conexao.close();
    }

         public void localizaAtletaAnterior(JogadoresModelo jogador, String id) throws SQLException{
        String sql = "select * from atleta";
        
        Statement stmt = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmt.executeQuery(sql); 
            rs.absolute(Integer.valueOf(id));
            if(rs.isFirst()){
                JOptionPane.showMessageDialog(null, "o registro é o primeiro");
            }else{
                rs.previous();

                jogador.setId(rs.getInt("id"));
                jogador.setNome(rs.getString("nome"));
                jogador.setTime(rs.getString("time"));
                jogador.setIdade(rs.getInt("idade"));
                jogador.setNumerodegols(rs.getInt("numerodegols"));
                jogador.setNumerocamisa(rs.getInt("numerocamisa"));
                jogador.setPosicao(rs.getString("posicao"));
                jogador.setTitular(rs.getInt("titular")); 
            }
            
            rs.close();
            stmt.close();
            conexao.close();
         
     }
}