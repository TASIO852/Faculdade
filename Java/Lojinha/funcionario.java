public class funcionario {

  private String nome;
  private int matricula;
  private int removeF = 0;

  public void setFuncionario(String nomef, int matriculaf) {
    nome = nomef;
    matricula = matriculaf;
  }

  public String getFumcionarioNome() {
    return nome;
  }

  public int getFumcionarioMatricula() {
    return matricula;
  }

  public void setFuncionarioRemover(int removido) {
    removeF = removido;
  }

  public int getFuncionarioRemover() {
    return removeF;
  }

  public void funcionarioCadastrado() {
    if (getFuncionarioRemover() == 0) {
      System.out.println(
          "Funcuionario cadastrado - Nome:" + getFumcionarioNome() + " Matricula:" + getFumcionarioMatricula());
    } else {
      System.out.println("Status - Foi Removido");
    }
  }
}