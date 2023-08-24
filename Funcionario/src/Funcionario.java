
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuário
 */
public class Funcionario extends Pessoa {
    private double salario;
    private Date dataContratacao = new Date();
    private boolean ferias = false;

    public Funcionario(double salario, String nome, int idade, String cpf, String numTelefone) {
        super(nome, idade, cpf, numTelefone);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public boolean isFerias() {
        return ferias;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public void setFerias(boolean ferias) {
        this.ferias = ferias;
    }
    
    
}
