/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gustavo
 */
public class Lancha extends Veiculo{
    private int numMotores;

    public Lancha(int numMotores, String modelo, int numLugares, int ano, String cor, int comprimento) {
        super(modelo, numLugares, ano, cor, comprimento);
        this.numMotores = numMotores;
    }

    public int getNumMotores() {
        return numMotores;
    }

    public void setNumMotores(int numMotores) {
        this.numMotores = numMotores;
    }
}
