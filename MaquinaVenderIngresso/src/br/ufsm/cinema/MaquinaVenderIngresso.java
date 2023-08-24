/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufsm.cinema;

/**
 *
 * @author Gustavo
 */
class MaquinaVenderIngresso{
        //Atribustos ou campos da classe
    // O preço de um ingresso
    private int preco;
    //Quantidade de ingressos a ser vendida para um comprador
    private int quantidadeIngressos;
    //Quantia de dinheiro inserida para comprar o ingresso
    private int montanteDinheiro;    
    // A quantia total de dinheiro coletada por esta máquina
    private int total;   

    /**
     ************** Construtor da classe MaquinaVenderIngresso***************
     *Cria uma máquina de venda de bilhetes com valores pré fixados do preço unitário do bilhete.
     *Note que o preço deve ser maior de zero, embora não há nenhuma verificação para assegurar isto         
     **/
    public MaquinaVenderIngresso(int preco){
        this.preco = preco;
        this.montanteDinheiro = 0;
        this.total = 0;
        this.quantidadeIngressos=0;
    }    

    public int getQuantidadeIngressos() {
        return quantidadeIngressos;
    } 
    
    /**
     * ********Metodo ou Operacao********
     * Retorne o preço de um bilhete
     **/    
    public int getPreco(){
        return preco;
    }

       /**
     * ********Metodo ou Operacao********
     * Retorne a quantia de dinheiro inserida para comprar o ingresso
     **/    
    public int getMontanteDinheiro(){
        return montanteDinheiro;
    }

   public void setQuantidadeIngressos(int quantidadeIngressos) {
        this.quantidadeIngressos = quantidadeIngressos;
    }
                
    public void setMontanteDinheiro(int montanteDinheiro) {
        this.montanteDinheiro = montanteDinheiro;
    }
    
    /**
     * 
    * ********Metodo inserir dinheiro********
    * Recebe o montante de dinheiro, de um cliente, para cobrar o ingresso 
    */
    public void inserirDinheiro(int valorInserido){
        montanteDinheiro = valorInserido;
        
    }

    public int cobrarIngresso(int qtdIngressos){
        int valorTotal=preco*qtdIngressos;
        if(montanteDinheiro > valorTotal){
           return montanteDinheiro - valorTotal;
        }else if(montanteDinheiro == valorTotal){
            return 0;
        }else{
            return -1;   
        }    
        
    }
         
    public void imprimeIngresso(int troco) {
        // Simulate the printing of a ticket.

        System.out.println("\n\n\n###########################################");
        if (troco >= 0) {

            System.out.printf("#Total ingressos: %d \n", quantidadeIngressos);
            System.out.println("#Preço unitário: " + preco + " reais.");
            System.out.println("#Troco: " + troco);
            System.out.println("###########################################");

            System.out.println();
            // Update the total collected with the balance.
            total += montanteDinheiro;
            // Clear the balance.
            montanteDinheiro = 0;
            quantidadeIngressos = 0;
        } else {
            System.out.println("Dinheiro insuficiente, refaça a compra");
            System.out.println("###########################################");
        }

    } 
}

