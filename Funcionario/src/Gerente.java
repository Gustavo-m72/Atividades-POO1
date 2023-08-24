/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuário
 */
public class Gerente extends Funcionario implements IFuncionarios {
    String cargo = "Gerente";
    private int senha;
    private int qtdSubordinados;
    private double bonusSalario = 0.25;

    public Gerente(int senha, int qtdSubordinados, double salario, String nome, int idade, String cpf, String numTelefone) {
        super(salario, nome, idade, cpf, numTelefone);
        this.senha = senha;
        this.qtdSubordinados = qtdSubordinados;
    }

    public String getCargo() {
        return cargo;
    }

    public int getSenha() {
        return senha;
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

    public void setSenha(int senha) {
        this.senha = senha;
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
