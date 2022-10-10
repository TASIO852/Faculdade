import java.util.Scanner;

class loja {
    public static pedido p;
    public static funcionario f;

    public static void main(String[] args) {

        int op = -1;
        Scanner myObjeto = new Scanner(System.in);

        while (op != 0) {
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

            System.out.println("Opção ->");
            op = myObjeto.nextInt();

            switch (op) {
            case 1:
                int pedidoID, codigo;
                float valorTotalCalculado;
                int dia, mes, ano;

                p = new pedido();

                Scanner pC = new Scanner(System.in);

                System.out.println("BEM VINDO AO CADASTRO DE PEDIDO");

                System.out.println("Digite os código do pedido:");
                pedidoID = pC.nextInt();

                System.out.println("Digite os Valor total do pedido:");
                valorTotalCalculado = pC.nextFloat();

                System.out.println("Digite o dia de criação do pedido:");
                dia = pC.nextInt();
                System.out.println("Digite o mês de criação do pedido:");
                mes = pC.nextInt();
                System.out.println("Digite o ano de criação do pedido:");
                ano = pC.nextInt();

                p.setPedido(pedidoID, valorTotalCalculado);
                p.setPedidoData(dia, mes, ano);
                p.pedidoCadastrado();
                break;
            case 2:
                System.out.println("BUSCAR PEDIDO");
                p.pedidoCadastrado();
                break;
            case 3:
                System.out.println("REMOVER PEDIDO");
                p.pedidoCadastrado();
                int remove = 1;
                System.out.println("Status - Foi Removido");

                p.setpedidoRemover(remove);
                break;
            case 4:
                String nome;
                int matricula;

                f = new funcionario();

                Scanner fc = new Scanner(System.in);

                System.out.println("BEM VINDO AO CADASTRO DE USUÁRIOS");
                System.out.println("Digite o nome do usuário:");
                nome = fc.nextLine();
                System.out.println("Matricula de usuário");
                matricula = fc.nextInt();

                f.setFuncionario(nome, matricula);
                f.funcionarioCadastrado();
                break;
            case 5:
                System.out.println("BUSCAR FUNCIONARIO");
                f.funcionarioCadastrado();
                break;
            case 6:
                System.out.println("REMOVER FUNCIONARIO");
                f.funcionarioCadastrado();
                int removeF = 1;
                System.out.println("Status - Foi Removido");
                f.setFuncionarioRemover(removeF);
                break;
            }
        }

    }
}
