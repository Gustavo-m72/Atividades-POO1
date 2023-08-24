/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dados.CadastroProdutoDados;
import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class CadastroProdutoNegocio {
    CadastroProdutoDados cadastroProdutoDados = new CadastroProdutoDados();
    
    public void solicitarGravacaoProdutos(String nomeProduto, String especificacaoTecnica, String precoCusto, int habilitarVenda){
        cadastroProdutoDados.gravaProduto(nomeProduto, especificacaoTecnica, precoCusto, habilitarVenda);
        
    }
    
    public ArrayList getDadosGravados(){
        return cadastroProdutoDados.getDados();
    }
}
