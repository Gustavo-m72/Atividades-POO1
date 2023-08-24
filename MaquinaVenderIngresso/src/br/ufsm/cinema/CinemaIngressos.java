/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.ufsm.cinema;

import java.util.Scanner;
import br.ufsm.cinema.MaquinaVenderIngresso

/*
 *
 * @author fabio
 * 
 */

      
    /**
     * ********Metodo ou Operacao********
     * Imprima um bilhete,
     * actualiza o total arrecadado com as vendas e 
     * fixa o montanteDinheiro para o combrar o proximo ingresso em zero.
     * 
     */



public class CinemaIngressos {
    /**
     * @param args the command line arguments
     */           
    public static void main(String[] args) {
       
            // TODO code application logic here
            int precoIngresso=20;
            int qtdIngressos;
            Scanner lerTeclado = new Scanner(System.in);
            
            MaquinaVenderIngresso vendaIngresso= new MaquinaVenderIngresso(precoIngresso);
              
            System.out.println("###############---CINEMÃO---###############");
            System.out.print("# Maquina de vender ingressos#\n");
            
            System.out.print("Digite a quantidade de ingressos desejada:");
            qtdIngressos = lerTeclado.nextInt();
            vendaIngresso.setQuantidadeIngressos(qtdIngressos);                        
            
            System.out.print("\nDigite o valor inserido para pagamento: ");
            vendaIngresso.setMontanteDinheiro(lerTeclado.nextInt());
            
           vendaIngresso.imprimeIngresso(vendaIngresso.cobrarIngresso(qtdIngressos));
     
    }
    
}
