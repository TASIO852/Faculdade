/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunolab08
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int idade;
        
        List<String> listaNomes = new ArrayList<>();
        
        String aux = "POO";
        listaNomes.add(aux);
        
        listaNomes.add("Maneiro");
        listaNomes.add("João");
        listaNomes.add("Maria");
       
        System.out.println("Qtd itens: " + listaNomes.size());
        
        System.out.println("Item na posicao 2: " + listaNomes.get(2));
        
        //for(int i=0; i<listaNomes.size(); i++){
        //}
       
        for(String item : listaNomes){
            System.out.println(item);  
        }
        
        
        
        
        
    }
    
}
