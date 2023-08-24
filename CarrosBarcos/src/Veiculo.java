/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gustavo
 */
public class Veiculo {
    private String modelo;
    private int numLugares;
    private int ano;
    private String cor; 
    private int comprimento;

    public Veiculo(String modelo, int numLugares, int ano, String cor, int comprimento) {
        this.modelo = modelo;
        this.numLugares = numLugares;
        this.ano = ano;
        this.cor = cor;
        this.comprimento = comprimento;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNumLugares() {
        return numLugares;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNumLugares(int numLugares) {
        this.numLugares = numLugares;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
}
