/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class CadastroProdutoDados {
    private ArrayList<ProdutoModelo> dados;
    
    public CadastroProdutoDados(){
        dados = new ArrayList<ProdutoModelo>();
    }
    
    public void gravaProduto(String nomeProduto, String especificacaoTecnica, String precoCusto, int habilitarVenda){
    double precoVenda = Double.parseDouble(precoCusto)*1.2;
    dados.add(new ProdutoModelo(nomeProduto, especificacaoTecnica, precoVenda, Double.parseDouble(precoCusto), habilitarVenda));
    }

    public ArrayList<ProdutoModelo> getDados() {
        return dados;
    }
    
}
