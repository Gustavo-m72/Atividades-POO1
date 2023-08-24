/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import dados.ProdutoModelo;
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
public class ProdutoDao {
    
    private Connection conexao = null;
    
    public ProdutoDao() throws SQLException{
        this.conexao = new ConexaoDao().getConexao();
    }
    
    public ArrayList<ProdutoModelo> consultar(String nomePesquisar) throws SQLException{
        
        String sql = "select * from cadastro.produto where nomeProduto like?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nomePesquisar);
        
        ResultSet rs = stmt.executeQuery();
        
        ArrayList<ProdutoModelo> minhaLista = new ArrayList<ProdutoModelo>();
        
        while(rs.next()){
            ProdutoModelo produto = new ProdutoModelo();
            produto.setId(rs.getInt("id"));
            produto.setNomeProduto(rs.getString("nomeProduto"));
            produto.setEspecificacaoTecnica(rs.getString("expecificacaoTecnica"));
            produto.setPrecoVenda(rs.getFloat("precoVenda"));
            produto.setPrecoCusto(rs.getFloat("precoCusto"));
            produto.setHabilitarVenda(rs.getInt("habilitaVenda"));
            
            minhaLista.add(produto);
        }
        
        rs.close();
        stmt.close();
        conexao.close();
        return minhaLista;
    }
    
    
    public void inserir(ProdutoModelo produto) throws SQLException{
        String sql = "insert into produto(nomeProduto, expecificacaoTecnica, precoVenda, precoCusto, habilitaVenda)" + "values(?,?,?,?,?)";
       try (PreparedStatement stmt = conexao.prepareStatement(sql)){
        stmt.setString(1,produto.getNomeProduto());
        stmt.setString(2,produto.getEspecificacaoTecnica());
        stmt.setFloat(3,produto.getPrecoVenda());
        stmt.setFloat(4, produto.getPrecoCusto());
        stmt.setInt(5, produto.getHabilitarVenda());
        stmt.execute();
    }
    conexao.close();    
    }
    
    public void alterar(ProdutoModelo produto) throws SQLException{
    
        String sql = "update produto set nomeProduto=?, expecificacaoTecnica=?, precoVenda=?, precoCusto=?, habilitaVenda=? where id=?";
       try (PreparedStatement stmt = conexao.prepareStatement(sql)){
        stmt.setString(1,produto.getNomeProduto());
        stmt.setString(2,produto.getEspecificacaoTecnica());
        stmt.setFloat(3,produto.getPrecoVenda());
        stmt.setFloat(4, produto.getPrecoCusto());
        stmt.setInt(5, produto.getHabilitarVenda());
        stmt.execute();
    }
    conexao.close();
 
    }
    
    public void remover(ProdutoModelo produto) throws SQLException{
        
    String sql = "delete from produto where id=?";
    
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        stmt.setInt(1, produto.getId());
        
        stmt.execute();
        stmt.close();
        conexao.close();
    }

    
    public void localizarPrimeiroProduto(ProdutoModelo referenciaProduto) throws SQLException{
    String sql = "select * from produto";

    Statement stmt = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
    ResultSet rs = stmt.executeQuery(sql); 
            rs.first();
            //ProdutoModelo produto = new ProdutoModelo();
            referenciaProduto.setId(rs.getInt("id"));
            referenciaProduto.setNomeProduto(rs.getString("nomeProduto"));
            referenciaProduto.setEspecificacaoTecnica(rs.getString("expecificacaoTecnica"));
            referenciaProduto.setPrecoVenda(rs.getFloat("precoVenda"));
            referenciaProduto.setPrecoCusto(rs.getFloat("precoCusto"));
            referenciaProduto.setHabilitarVenda(rs.getInt("habilitaVenda"));
            rs.close();
            stmt.close();
            conexao.close();
    }

    
    public void localizarProximoProduto(ProdutoModelo referenciaProduto, String id) throws SQLException{
        String sql = "select * from produto";
        
        Statement stmt = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmt.executeQuery(sql); 
            rs.absolute(Integer.valueOf(id));
            if(rs.isLast()){
                JOptionPane.showMessageDialog(null, "o registro já é o ultimo");
            }else{
                rs.next();
            //ProdutoModelo produto = new ProdutoModelo();
                referenciaProduto.setId(rs.getInt("id"));
                referenciaProduto.setNomeProduto(rs.getString("nomeProduto"));
                referenciaProduto.setEspecificacaoTecnica(rs.getString("expecificacaoTecnica"));
                referenciaProduto.setPrecoVenda(rs.getFloat("precoVenda"));
                referenciaProduto.setPrecoCusto(rs.getFloat("precoCusto"));
                referenciaProduto.setHabilitarVenda(rs.getInt("habilitaVenda")); 
            }
            
            rs.close();
            stmt.close();
            conexao.close();
    }

    
    public void localizaUltimoProduto(ProdutoModelo referenciaProduto) throws SQLException{
    
    String sql = "select * from produto";

    Statement stmt = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
    ResultSet rs = stmt.executeQuery(sql); 
            rs.last();
            //ProdutoModelo produto = new ProdutoModelo();
            referenciaProduto.setId(rs.getInt("id"));
            referenciaProduto.setNomeProduto(rs.getString("nomeProduto"));
            referenciaProduto.setEspecificacaoTecnica(rs.getString("expecificacaoTecnica"));
            referenciaProduto.setPrecoVenda(rs.getFloat("precoVenda"));
            referenciaProduto.setPrecoCusto(rs.getFloat("precoCusto"));
            referenciaProduto.setHabilitarVenda(rs.getInt("habilitaVenda"));
            rs.close();
            stmt.close();
            conexao.close();
    }

         public void localizaProdutoAnterior(ProdutoModelo referenciaProduto, String id) throws SQLException{
        String sql = "select * from produto";
        
        Statement stmt = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmt.executeQuery(sql); 
            rs.absolute(Integer.valueOf(id));
            if(rs.isFirst()){
                JOptionPane.showMessageDialog(null, "o registro é o primeiro");
            }else{
                rs.previous();
            //ProdutoModelo produto = new ProdutoModelo();
                referenciaProduto.setId(rs.getInt("id"));
                referenciaProduto.setNomeProduto(rs.getString("nomeProduto"));
                referenciaProduto.setEspecificacaoTecnica(rs.getString("expecificacaoTecnica"));
                referenciaProduto.setPrecoVenda(rs.getFloat("precoVenda"));
                referenciaProduto.setPrecoCusto(rs.getFloat("precoCusto"));
                referenciaProduto.setHabilitarVenda(rs.getInt("habilitaVenda")); 
            }
            
            rs.close();
            stmt.close();
            conexao.close();
         
     }
}