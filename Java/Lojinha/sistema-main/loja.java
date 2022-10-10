import java.util.Scanner;

class loja {

    public static void main(String[] args) {
        System.out.println("Sistema Comercial de Controle de Pedidos e Funcionarios");
        System.out.println("           ================================");
        System.out.println("           |   1 - Cadatrar Pedido        |");
        System.out.println("           |   2 - Buscar Pedido          |");
        System.out.println("           |   3 - Remover Pedido         |");
        System.out.println("           |   4 - Cadatrar Funcionario   |");
        System.out.println("           |   5 - Buscar Funcionario     |");
        System.out.println("           |   6 - Remover Funcionario    |");
        System.out.println("           |   0 - Sair                   |");
        System.out.println("           ================================");

        Scanner myObj = new Scanner(System.in);
        int menu;

        System.out.println("Opção ->");
        menu = myObj.nextInt();

        System.out.println("Sua opção é: " + menu);

        switch (menu) {
        case 1:
            pedido pcadas = new pedido();
            pcadas.pedidoCadastrar();
            break;
        case 2:
            pedido pbusca = new pedido();
            pbusca.pedidoBuscar();
            break;
        case 3:
            pedido pRemovido = new pedido();
            pRemovido.pedidoRemover();
            break;
        case 4:
            funcionario fcadas = new funcionario();
            fcadas.funcionarioCadastrar();
            break;
        case 5:
            funcionario fbusca = new funcionario();
            fbusca.funcionarioBuscar();
            break;
        case 6:
            funcionario fRemovido = new funcionario();
            fRemovido.funcionarioRemover();
            break;
        case 0:
            System.out.println("Você saiu do sistema!");
            break;
        default:
            System.out.println("Que? Isso não é valido!");
        }
    }
}