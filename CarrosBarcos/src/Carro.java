/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gustavo
 */
public class Carro extends Veiculo{
    private int numPortas;
    private String placa;

    public Carro(int numPortas, String placa, String modelo, int numLugares, int ano, String cor, int comprimento) {
        super(modelo, numLugares, ano, cor, comprimento);
        this.numPortas = numPortas;
        this.placa = placa;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
