/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuário
 */
public class Item {
    private String titulo;
    private int tempoDuracao;
    private boolean tenho;
    private String descricao;

    public Item(){};
    
    public Item(String titulo, int tempoDuracao) {
        this.titulo = titulo;
        this.tempoDuracao = tempoDuracao;
        this.tenho = false;
        this.descricao = " ";
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempoDuracao() {
        return tempoDuracao;
    }

    public boolean getTenho() {
        return tenho;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTempoDuracao(int tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }

    public void setTenho(boolean tenho) {
        this.tenho = tenho;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDiretor(){
        return "";
    }    
    
    public String getArtista(){
        return "";
    } 
    
    public int getNumeroDeFaixas(){
        return 0;
    } 
}
