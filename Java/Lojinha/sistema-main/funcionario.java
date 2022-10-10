import java.util.Scanner;

public class funcionario {

  public void funcionarioCadastrar() {

    Scanner fc = new Scanner(System.in);

    System.out.println("BEM VINDO AO CADASTRO DE USUÁRIOS");
    System.out.println("Digite os dados:");
    String nome = fc.nextLine();
    System.out.println("Matricula de Usuário");
    int senha = fc.nextInt();

    System.out.println("Funcuionario cadastrado:" + nome + "" + senha);
  }

  public void funcionarioBuscar() {
    Scanner fB = new Scanner(System.in);

    System.out.println("BUSCAR Funcionario");
    System.out.println("Digite a matricula do funcuionario:");
    int matricula = fB.nextInt();

    switch (matricula) {
    case 1:
      System.out.println("Tem que aparer o funcuionario");
      break;
    default:
      System.out.println("Pedido não encontrato");
    }
  }

  public void funcionarioRemover() {
    Scanner fR = new Scanner(System.in);

    System.out.println("REMOVER PEDIDO");
    System.out.println("Digite a matricula do funcuionario:");
    int frcodigo = fR.nextInt();

    System.out.println("Funcuionario com a matricula" + frcodigo + "Foi removido");
  }
}