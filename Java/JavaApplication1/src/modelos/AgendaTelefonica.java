/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alunolab08
 */
public class AgendaTelefonica {
    
    Map<String, String> colecao = new HashMap<>();
    
    public void inserir(String nome, String numero){
        colecao.put(nome, numero);
    }
    
    public String buscar(String nome) {
        return colecao.get(nome);
    }
}
