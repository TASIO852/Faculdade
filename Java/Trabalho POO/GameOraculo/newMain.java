import java.util.Scanner;
import java.util.Random;

public class newMain {
    public static void main(String[] args) {

        // classes e bibliotecas
        oraculo magoOraculo = new oraculo();
        guerreiro useGuerreiro = new guerreiro();
        Random numeroOraculo = new Random();

        // variaveis do main
        int palpite = 0;
        int tentativas = 0;

        // metodos guerreiro
        int vidasG = useGuerreiro.getVidas();
        String misericordia = useGuerreiro.vidaExtra();

        // metodos Oraculo
        String introducao = magoOraculo.prologo();
        String vencedor = magoOraculo.prologoVencedor();
        String perdedor = magoOraculo.prologoPerdedor();
        int sorteado = numeroOraculo.nextInt(100) + 1;

        // perguntas
        Scanner pedirNomeG = new Scanner(System.in);
        Scanner numeroG = new Scanner(System.in);

        // valoores pre colocados
        magoOraculo.Nome = "Mago Drummond";


        // INTRODUCAO
        System.out.println("Guerreiro meu nome e " + magoOraculo.Nome);
        System.out.println("\nGuerreiro qual eo seu nome ? ");
        useGuerreiro.Nome = pedirNomeG.nextLine();
        System.out.println(useGuerreiro.Nome + introducao + vidasG + " vidas \n");

        // LEVEL 1
        while (palpite != sorteado) {
            System.out.println("Número de vidas: " + vidasG + "\n\n\n");
            System.out.print("Qual seu palpite: ");
            palpite = numeroG.nextInt();
            vidasG--;
            magoOraculo.level1(palpite, sorteado, vidasG);


            if (vidasG == 0) {
                System.out.println("faça seu pedido de misericordia\n");
                misericordia = useGuerreiro.vidaExtra();

                if (magoOraculo.decidirVidaExtra(misericordia) == true) {
                    System.out.println("vamos para o level 2 \n");
                    vidasG += 1;
                    break;
                }
                else{
                   System.out.println(perdedor);
                    break;
                }
            }

        }

        // LEVEL 2
        while (magoOraculo.decidirVidaExtra(misericordia) == true) {
            System.out.println("agora vc esta no level 2 " + useGuerreiro.Nome + " vamos jogar par ou impar e vc tem " + vidasG + " de vida \n");
            System.out.println("ok agora joque um numero de 1 a 5 \n");
            System.out.println("eu escolho impar\n");
            System.out.println("vc escolhe par ou impar\n");

            magoOraculo.level2(useGuerreiro.opcao, vidasG);
            break;

        }
    }
}