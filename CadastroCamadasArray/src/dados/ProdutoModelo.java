/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

/**
 *
 * @author Gustavo
 */
public class ProdutoModelo {
    String nomeProduto;
    String especificacaoTecnica;
    double precoVenda;
    double precoCusto;
    int habilitarVenda;

    public ProdutoModelo(String nomeProduto, String especificacaoTecnica, double precoVenda, double precoCusto, int habilitarVenda) {
        this.nomeProduto = nomeProduto;
        this.especificacaoTecnica = especificacaoTecnica;
        this.precoVenda = precoVenda;
        this.precoCusto = precoCusto;
        this.habilitarVenda = habilitarVenda;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getEspecificacaoTecnica() {
        return especificacaoTecnica;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public int getHabilitarVenda() {
        return habilitarVenda;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setEspecificacaoTecnica(String especificacaoTecnica) {
        this.especificacaoTecnica = especificacaoTecnica;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public void setHabilitarVenda(int habilitarVenda) {
        this.habilitarVenda = habilitarVenda;
    }  
}
