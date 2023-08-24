/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuário
 */
public class Secretario extends Funcionario{
    private String cargo;
    private String turno;
    private String local;
    
    @Override
    public double getBonificacao(){
        return super.getSalario() * 10;
    }
}
