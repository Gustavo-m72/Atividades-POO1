
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuário
 */
public class DataBase {
    private ArrayList<Veiculo> veiculos;

    /*public Database(){
        cds=new ArrayList<CD>();
        dvds=new ArrayList<DVD>();
    }*/

    /*public Database(){
        veiculos = new ArrayList<Veiculo>();
    }*/
        
    public DataBase(){
        veiculos = new ArrayList<Veiculo>();
    }
    
    /*public void setCds(CD cds) {
        this.cds.add(cds);
    }

    public void setDvds(DVD dvds) {
        this.dvds.add(dvds);
    }

    public ArrayList<CD> getCds() {
        return cds;
    }

    public ArrayList<DVD> getDvds() {
        return dvds;
    }*/

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }
    
    public void adicionaNovoVeiculo(Veiculo novoVeiculo){
        veiculos.add(novoVeiculo);
    }
    
    
}
