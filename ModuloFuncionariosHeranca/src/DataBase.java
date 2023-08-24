
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
   private ArrayList<Funcionario> dataBase;
   
   public DataBase(){
       dataBase = new ArrayList<Funcionario>();
   }

    public ArrayList<Funcionario> getFuncionario() {
        return dataBase;
    }
    
    /*public void adicionaNovoFunc(Funcionario novoFuncionario){
        funcionario.add(novoFuncionario);
    }*/
    
    public void setFuncionario(Funcionario funcionario) {
        this.dataBase.add(funcionario);
    }
 
}
