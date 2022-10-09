/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author alunodev08
 */
public class UsaZoo {
    public static void main(String[] args) {
        System.out.println(" == SerVivo ==");
        SerVivo sv = new SerVivo();
        sv.tamanho = 10;
        sv.nascer();
        sv.crescer();
        sv.morrer();
        
        System.out.println(" == Animal ==");
        Animal an = new Animal();
        an.mover();
        an.respirar();
        an.nascer();
        an.crescer();
        an.morrer();

        System.out.println(" == Peixe ==");
        Peixe px = new Peixe();
        px.nascer();
        px.crescer();
        px.morrer();
        px.mover();
        px.respirar();

        
        
        
    }
}
