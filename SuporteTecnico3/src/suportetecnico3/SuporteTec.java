/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suportetecnico3;

import java.util.HashSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class SuporteTec {
    private TratamentoPerguntas geradorConPalavras;
    private Respostas geradorRespostas;

    public SuporteTec() {
        geradorConPalavras = new TratamentoPerguntas();
        geradorRespostas = new Respostas();
    }
    
    public String processamentoPerguntaResposta(String frase){
        HashSet conjuntoPalavras = geradorConPalavras.conjuntoPlavrasDigitadas(frase);
        String resposta = geradorRespostas.geradorResposta(conjuntoPalavras);
        return resposta;
    }
    
    public void bemVindo(){
        String mensagem = "Bem-vindo ao sistema de Suporte Técnico.\n";
        mensagem = mensagem + "fale sobre seu problema. \n";
        mensagem=mensagem+ "vamos ajudá-lo";
        
        JFrame frame = new JFrame ("JOpitionPane showMesseDialog");
        JOptionPane.showMessageDialog(frame, mensagem + "'","suporte Técnico", JOptionPane.INFORMATION_MESSAGE);
        
        
    }
    
}
