/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suportetecnico3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Gustavo
 */
public class Respostas {
    private final HashMap respostas;
    private final ArrayList respostasGenericas;
    private final Random geradorAleatorio;

    public Respostas(){
        respostas = new HashMap();
        respostasGenericas = new ArrayList();
        respostasCompletasMap();
        respostasPadrao();
        geradorAleatorio = new Random();
    }
    
    private void respostasCompletasMap(){
        respostas.put("poo", "a melhor disciplina");
        
        respostas.put("trava", "Bem, ele nunca falha em nosso sistema. Deve haver algo para fazer com seu software.");
        
        respostas.put("lento", "acho que isso tem haver com seu hardware");
        
        respostas.put("desempenho", "o desempenho foi bom em todos os nossos testes");
        
        respostas.put("erro", "Bem, você sabe que todo software tem alguns erros");
        
        respostas.put("win", "esse é um erro conhecido realicionado ao sistema windows");
        
        respostas.put("caro", "o custo do nosso produto é bastente competitivo");
        
        respostas.put("instalacao", "a instalaçao é realmete simples");
        
        respostas.put("memeoria", 
                    "se você ler os requisitos de sistma, verá que \n" +
                    "os requisitos de memoria especificados são 1,5gwats. \n"+
                    "caso não tenha essa quantidade disponível aumente a \n"+
                     "capacidade de memoria. Mais alguma cosa que vocÊ deseja saber");
    }
    
    private void respostasPadrao(){
        respostasGenericas.add("isso parece estranho. descreva com mais detalhes");
        
        respostasGenericas.add("nenhum outro cliente reclamou disso antes. \n" + 
                "qual a configuração do sistema?");
        
        respostasGenericas.add("parece interessante. Conte-me mais");
    }
    
    private String escolhaDaRespPadrao(){
        int index = geradorAleatorio.nextInt(respostasGenericas.size());
        return (String) respostasGenericas.get(index);
    }
    
    public String geradorResposta(HashSet words){
        Iterator it = words.iterator();
        while(it.hasNext()){
            String word = (String) it.next();
            String response = (String) respostas.get(word);
            if(response != null){
                return response;
            }
        }
        return escolhaDaRespPadrao();
    }
}
