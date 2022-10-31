import java.util.Random;
import java.util.Scanner;

public class oraculo {

    public String Nome;
    guerreiro useGuerreiro = new guerreiro();

    // nome oraculo
    public void setNome(String nome) {
        this.Nome = nome;
    }

    // vidas do guerreio
    public int setVidas() {
        Random vidas = new Random();
        return vidas.nextInt(4) + 9;
    }

    // primeira conversa
    public String prologo() {
        String txt = " vamos jogar dois jogas para vc ter um premio e vc tera ";
        return txt;
    }

    // primeiro mini game

    public static void level1(int palpite, int numero, int vidasGPerda) {
        if (palpite > numero) {
            System.out.println("Seu palpite é maior que o número sorteado.");
        } else {
            if (palpite < numero) {
                System.out.println("Seu palpite é menor que o número sorteado.");
            } else {
                System.out.println("Parabéns, você acertou! O número era " + numero);
                System.out.println("Você tem de  " + vidasGPerda + " pontos de vida");
            }
        }
    }

    // segundo mini game
    public void level2(int opcao, int vidasG) {
        int num, num2, poi;

        Scanner in = new Scanner(System.in);
        System.out.println("coloque um numero");
        Random vidas = new Random();
        
        num2 = vidas.nextInt(5) + 1;
        num = in.nextInt() + num2;
        poi = (num % 2);
        if (poi == 0) {
            System.out.println(num + " e par " + prologoVencedor());
        } else {
            System.out.println(num + " e impar " + prologoPerdedor());
            vidasG--;
        }
    }

    // vida Extra para o guerreiro
    public boolean decidirVidaExtra(String misericordia) {
        if (misericordia.length() >= 5) {
            System.out.println("te darei mais uma vida guerreiro");
            return true;
        } else {
            return false;
        }
    }

    // ultima conversa
    public String prologoVencedor() {
        String txt = "vc ganhou";
        return txt;
    }

    public String prologoPerdedor() {
        String txt = "vc perdeu";
        return txt;
    }

}
