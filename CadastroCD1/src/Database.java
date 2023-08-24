/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
/**
 *
 * @author Gustavo
 */
public class Database {
    //private ArrayList<CD> cds;
   // private ArrayList<DVD> dvds;
    private ArrayList<Item> itens;

    /*public Database(){
        cds=new ArrayList<CD>();
        dvds=new ArrayList<DVD>();
    }*/

    public Database(){
        itens = new ArrayList<Item>();
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

    public ArrayList<Item> getItens() {
        return itens;
    }
    
    public void adicionaNovoItem(Item novoItem){
        itens.add(novoItem);
    }
    
    
    
}
