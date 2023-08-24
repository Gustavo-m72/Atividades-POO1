/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuário
 */
public abstract class Pessoa {
   private String nome;
   private int idade;
   private String cpf;
   private String numTelefone;

    public Pessoa(String nome, int idade, String cpf, String numTelefone) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.numTelefone = numTelefone;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNumTelefone() {
        return numTelefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNumTelefone(String numTelefone) {
        this.numTelefone = numTelefone;
    }
}
