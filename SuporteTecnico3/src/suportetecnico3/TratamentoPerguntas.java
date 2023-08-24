/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suportetecnico3;

import java.text.Normalizer;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 *
 * @author Gustavo
 */
//trasnforma texto digitado em texto padrao
public class TratamentoPerguntas {
   HashSet words; 
   
   public HashSet conjuntoPlavrasDigitadas(String frase){
       frase=frase.replace("?", "");
       frase = Normalizer.normalize(frase, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]","");
       StringTokenizer tokenizer = new StringTokenizer(frase);
       words = new HashSet();
       while(tokenizer.hasMoreTokens())
           words.add(tokenizer.nextToken());
       return words;
   }
}
