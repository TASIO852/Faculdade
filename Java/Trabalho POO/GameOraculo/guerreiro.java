import java.util.Scanner;

public class guerreiro {
    public String Nome;
    public int vidas;
    int opcao;
   
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getVidas() {
        oraculo magoOraculo = new oraculo();
        return magoOraculo.setVidas();
    }

    public String getNome() {
        return Nome;
    }

    public String vidaExtra() {
        Scanner misericordia = new Scanner(System.in);
        return misericordia.nextLine();
    }
}