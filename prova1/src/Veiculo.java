/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuário
 */
public class Veiculo {
    private String marca;
    private int potencia;
   
    //private int numerodelugares;
    private double valor;
    private String cor;

    public Veiculo(int potencia,String marca, double valor, String cor) {
        this.potencia = potencia;
        this.marca = marca;
        this.valor = valor;
        this.cor = cor;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public int getCilindradas() {
        return 0;
    }
    
    public int getCv() {
        return 0;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    

  

    

    public String getMarca() {
        return marca;
    }

    

    
    
}
