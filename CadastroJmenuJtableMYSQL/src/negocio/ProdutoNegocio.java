/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dados.ProdutoModelo;
import dao.ProdutoDao;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class ProdutoNegocio {
    public ArrayList consultarProdutos(String nomePesquisar) throws SQLException{
        
        ProdutoDao dao = new ProdutoDao();
        ArrayList<ProdutoModelo> minhaLista = dao.consultar(nomePesquisar); 
        return minhaLista;
        
    }
    
    public void inserirProdutos(String nomeProduto, String especificacaoTecnica, String precoVenda, String precoCusto, int habilitaVenda) throws SQLException{
        ProdutoModelo produto = new ProdutoModelo();
        
        produto.setNomeProduto(nomeProduto);
        produto.setEspecificacaoTecnica(especificacaoTecnica);
        produto.setPrecoVenda(Float.parseFloat(precoVenda));
        produto.setPrecoCusto(Float.parseFloat(precoCusto));
        produto.setHabilitarVenda(habilitaVenda);
        
        ProdutoDao dao = new ProdutoDao();
        
        dao.inserir(produto);
        
        JOptionPane.showMessageDialog(null, "Cadastro inserido com Sucesso");
    }


    public void alterarProdutos(String id,String nomeProduto, String especificacaoTecnica, String precoVenda, String precoCusto, int habilitaVenda) throws SQLException{

        ProdutoModelo produto = new ProdutoModelo();
        produto.setId(Integer.parseInt(id));
        produto.setNomeProduto(nomeProduto);
        produto.setEspecificacaoTecnica(especificacaoTecnica);
        produto.setPrecoVenda(Float.parseFloat(precoVenda));
        produto.setPrecoCusto(Float.parseFloat(precoCusto));
        produto.setHabilitarVenda(habilitaVenda);
        
        ProdutoDao dao = new ProdutoDao();
        
        dao.alterar(produto);
        
        JOptionPane.showMessageDialog(null, "Cadastro alterado com Sucesso");
     
     
    }

    
    public void removerProdutos(String id) throws SQLException{
        
        ProdutoModelo produto = new ProdutoModelo();
        produto.setId(Integer.parseInt(id));
        
        ProdutoDao dao = new ProdutoDao();
        
        dao.remover(produto);
        
        JOptionPane.showMessageDialog(null, "Cadastro removido com Sucesso");
    
    
    }
    
     public void localizaPrimeiroProduto(ProdutoModelo referenciaProduto) throws SQLException{
       
         ProdutoDao dao = new ProdutoDao();
         
         dao.localizarPrimeiroProduto(referenciaProduto);
         
     }
     
     
     public void localizaProximoProduto(ProdutoModelo referenciaProduto, String id) throws SQLException{
       
         ProdutoDao dao = new ProdutoDao();
         
         dao.localizarProximoProduto(referenciaProduto, id);
         
     }
     
     
     public void localizaUltimoProduto(ProdutoModelo referenciaProduto) throws SQLException{
       
         ProdutoDao dao = new ProdutoDao();
         
         dao.localizarPrimeiroProduto(referenciaProduto);
         
     }
     
     
     public void localizaProdutoAnterior(ProdutoModelo referenciaProduto, String id) throws SQLException{
       
         ProdutoDao dao = new ProdutoDao();
         
         dao.localizarPrimeiroProduto(referenciaProduto);
         
     }
     
}
