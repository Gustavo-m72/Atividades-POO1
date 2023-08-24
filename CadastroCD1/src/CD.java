/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gustavo
 */
public class CD extends Item{
    //private String titulo;
    private String artista;
    private int numeroDeFaixas;
    //private int tempoDuracao;
    //private boolean tenho;
    //private String descricao;

    public CD(String titulo, String artista, int numeroDeFaixas, int tempoDuracao) {
        super(titulo,tempoDuracao);
//this.titulo = titulo;
        this.artista = artista;
        this.numeroDeFaixas = numeroDeFaixas;
        //this.tempoDuracao = tempoDuracao;
        //this.tenho = false;
        //this.descricao = " ";
    }
    @Override
    public String getArtista() {
        return artista;
    }
    @Override
    public int getNumeroDeFaixas() {
        return numeroDeFaixas;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setNumeroDeFaixas(int numeroDeFaixas) {
        this.numeroDeFaixas = numeroDeFaixas;
    }
}
