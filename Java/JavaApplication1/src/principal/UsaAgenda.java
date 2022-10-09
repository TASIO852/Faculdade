/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import modelos.AgendaTelefonica;

/**
 *
 * @author alunolab08
 */
public class UsaAgenda {
    public static void main(String[] args) {
        AgendaTelefonica ag = new AgendaTelefonica();
        
        ag.inserir("João", "123456");
        ag.inserir("Maria", "888888");
        ag.inserir("Jose", "999999");
        
        System.out.println("O número do tel da Maria é: " + ag.buscar("Maria"));
    }
}
