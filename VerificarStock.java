
import java.util.Scanner;

public class VerificarStock extends Produtos {

  public static Scanner leitor = new Scanner(System.in);

  public VerificarStock(int tamanhoStock) {
    super(tamanhoStock);
  }

  public String nome(String nome) {
    return leitor.nextLine();
  }

  public void verificarNome(String nome) {
    int posicao;
    for (int i = 0; i < getTamanhoNome(); i++) {
      if (nome.equals(getNome(i))) {
        posicao = i;
        System.out.printf("Nome:%s e local do stock:%d", getNome(i), posicao);
      }
    }
  }

}
