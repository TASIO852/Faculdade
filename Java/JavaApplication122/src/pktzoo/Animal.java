/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pktzoo;

/**
 *
 * @author alunodev08
 */
public class Animal extends SerVivo {
    public int numPatas;
    
    public void mover(){
        System.out.println("Animal: mover()");
    }
    
    public void respirar(){
        System.out.println("Animal: respirar() - AR");
    }  
}
