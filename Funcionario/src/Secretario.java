/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuário
 */
public class Secretario extends Funcionario implements IFuncionarios {
    String cargo = "Secretario";
    
    private int qtdSubordinados;
    private double bonusSalario = 0.25;
    private String local;

    public Secretario(int qtdSubordinados, String local, double salario, String nome, int idade, String cpf, String numTelefone) {
        super(salario, nome, idade, cpf, numTelefone);
        this.qtdSubordinados = qtdSubordinados;
        this.local = local;
    }
    
    public String getCargo() {
        return cargo;
    }

   
    public int getQtdSubordinados() {
        return qtdSubordinados;
    }

    public double getBonusSalario() {
        return bonusSalario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

   

    public void setQtdSubordinados(int qtdSubordinados) {
        this.qtdSubordinados = qtdSubordinados;
    }

    public void setBonusSalario(double bonusSalario) {
        this.bonusSalario = bonusSalario;
    }
    
    @Override 
    public boolean tirarFerias(){
        return true;
    }
    
    @Override 
    public void baterPonto(){
    }
    
    @Override
    public void trabalhar(){
    }
    
    @Override
    public double  getbonificacao(){
        return bonusSalario;
    }
}
