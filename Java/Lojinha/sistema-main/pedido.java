import java.util.Scanner;

public class pedido {

    public void pedidoCadastrar() {
        Scanner pC = new Scanner(System.in);

        System.out.println("BEM VINDO AO CADASTRO DE PEDIDO");
        System.out.println("Digite os Codigo do pedido:");
        int codigo = pC.nextInt();
        System.out.println("Digite os Valor total do pedido:");
        float valorTotal = pC.nextFloat();

        System.out.println("Pedido cadastrado Codigo:" + codigo + " Valor:" + valorTotal);
    }

    public void pedidoBuscar() {
        Scanner pB = new Scanner(System.in);

        System.out.println("BUSCAR PEDIDO");
        System.out.println("Digite os Codigo do pedido:");
        int codigo = pB.nextInt();

        switch (codigo) {
        case 1:
            System.out.println("Tem que aparer pedido");
            break;
        default:
            System.out.println("Pedido não encontrato");
        }
    }

    public void pedidoRemover() {
        Scanner pR = new Scanner(System.in);

        System.out.println("REMOVER PEDIDO");
        System.out.println("Digite os Codigo do pedido:");
        int rcodigo = pR.nextInt();

        System.out.println("Pedido codigo" + rcodigo + "Foi removido");
    }
}