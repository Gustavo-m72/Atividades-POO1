
import java.io.ObjectInputStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gustavo
 */
public class DVD extends Item {
    //private String titulo;
    private String diretor;

  //  private int tempoDuracao;
   // private boolean tenho;
   // private String descricao;
    
    public DVD(){}
    
    public DVD(String titulo, String diretor, int tempoDuracao) {
        super(titulo,tempoDuracao);
        this.diretor = diretor;
 
    }

   
    @Override
    public String getDiretor() {
        return diretor;
    }

   /* public void setDiretor(String diretor) {
        this.diretor = diretor;
    }  */  
}
