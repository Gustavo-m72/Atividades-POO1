/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuário
 */
public class Gerente extends Funcionario {
    private int senha;
    private int numeroDeFuncionariosGerenciados;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    
    
    public Gerente(int senha, int numeroDeFuncionariosGerenciados, String nome, String cpf, double salario) {
        super(nome,cpf,salario);
        this.senha = senha;
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
    @Override
    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public int getSenha() {
        return senha;
    }
    
    
    
    
    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
    
    @Override
    public double getBonificacao(){
        return super.getSalario() * 0.25;
    }
    
    public boolean autentica(int senha){
        if(this.senha == senha){
            System.out.println("Senha correta!");
            return true;
        }else {
            System.out.println("Senha incorreta!");
            return false;
        }
    }
}
