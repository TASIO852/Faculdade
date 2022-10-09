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
        cc.depositar(100);
        cc.sacar(50);
        
        Cliente cli = new Cliente();
        cli.setNome("Maria");
        cli.setEndereco("Mora na UVV");
        cli.setCpf("12345678-90");
        
        cc.setCorrentista(cli);
        
        System.out.println(cc.getCorrentista().getNome());
        System.out.println(cc.getCorrentista().getCpf());
        
    }
}
