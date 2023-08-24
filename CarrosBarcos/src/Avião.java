/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gustavo
 */
public class Avião extends Veiculo{
    private String prefixo;
    private int numTurbinas;

    public Avião(String prefixo, int numTurbinas, String modelo, int numLugares, int ano, String cor, int comprimento) {
        super(modelo, numLugares, ano, cor, comprimento);
        this.prefixo = prefixo;
        this.numTurbinas = numTurbinas;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public int getNumTurbinas() {
        return numTurbinas;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public void setNumTurbinas(int numTurbinas) {
        this.numTurbinas = numTurbinas;
    }
}
