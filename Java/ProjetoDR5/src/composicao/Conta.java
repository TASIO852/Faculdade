/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacao;

/**
 *
 * @author alunodev08
 */
public class Conta {
    private double saldo;
    private int numeroDaConta;
    
    private Cliente correntista;


    
  // estrutra sintática de um método
  // <modificado de acesso> <retorno> <nome> (<paramatros>){}
     public boolean sacar (double valor){
         if (verificarTransacao(valor)) {
             saldo = saldo - valor;
             return true;
         }    
         else
             return false;
     }
     
     public void depositar(double valor){
         saldo = saldo + valor;
     }
     
     public void transferir(Conta destino, double valor){
         this.sacar(valor);
         destino.depositar(valor);
     } 
     
     private boolean verificarTransacao(double valor){
         return saldo >= valor; 
         /*
         if(saldo >= valor)
             return true;
         else 
             return true;
         */
     }

    public Conta() {
        correntista = new Cliente();
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public Cliente getCorrentista() {
        return correntista;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void setCorrentista(Cliente correntista) {
        this.correntista = correntista;
    }
    
    
    
}
