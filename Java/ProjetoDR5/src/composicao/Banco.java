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
public class Banco {
    public static void main(String[] args) {
        
        Conta cc = new Conta();
        cc.setNumeroDaConta(1);
        System.out.println("Antes Deposito: " + cc.getSaldo());
        cc.depositar(100);
        System.out.println("Depois Deposito: " + cc.getSaldo());
        
        if(cc.sacar(500)){
            System.out.println("Saque efetuado com sucesso");
        }
        else{
            System.out.println("Deu ruim...");
        }
        
        Cliente cli = new Cliente();
        cli.setNome("Maria");
        cli.setEndereco("Mora na UVV");
        cli.setCpf("12345678-90");
        
        Cliente cli2 = new Cliente();
        cli2.setNome("Joao");
        cli2.setEndereco("Mora em Casa");
        cli2.setCpf("88888888-88");        
        
        cc.setCorrentista(cli);
        
        System.out.println(cc.getCorrentista().getNome());
        System.out.println(cc.getCorrentista().getCpf());
        
        Conta cc02 = new Conta();
        cc02.setNumeroDaConta(2);
        cc02.depositar(200);

        System.out.println(" == ANTES == ");
        System.out.println("cc.getSaldo(): " + cc.getSaldo());
        System.out.println("cc02.getSaldo(): " + cc02.getSaldo());
    
        System.out.println("Transferindo 30.....");    
        cc.transferir(cc02, 30);
        
        System.out.println(" == DEPOIS == ");
        System.out.println("cc.getSaldo(): " + cc.getSaldo());
        System.out.println("cc02.getSaldo(): " + cc02.getSaldo());
        
        
    }
    
}
