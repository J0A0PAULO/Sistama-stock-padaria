import java.util.Scanner;

public class EntradaPadariaStock extends Produtos {

  public static Scanner leitor = new Scanner(System.in);

  public EntradaPadariaStock(int tamanhoStock) {
    super(tamanhoStock);
  }

  public static int tamanhoStock() {
    return leitor.nextInt();
  }

  public void entradaNome() {
    for (int i = 0; i < getTamanhoNome(); i++) {
      System.out.println("digite seu nome " + (i + 1) + "o");
      String entradaNome = leitor.nextLine();
      setNome(i, entradaNome);
    }
  }

  public void entradaID() {
    for (int i = 0; i < getTamanhoId(); i++) {
      System.out.println("DIGITE SEU ID");
      int entradaID = leitor.nextInt();
      setId(i, entradaID);
    }
  }

  public void entradaQuantidade() {
    for (int i = 0; i < getTamanhoQnt(); i++) {
      System.out.println("digite quantidade De" + getNome(i));
      int entradaQuantidade = leitor.nextInt();
      setQuantidade(i, entradaQuantidade);
    }
  }

  public void entradaFornecedor() {
    for (int i = 0; i < getTamanhoFornecedor(); i++) {
      System.out.println("DIGITE NOME DO FORNECEDOR");
      String entradaFornecedor = leitor.nextLine();
      setFornecedor(i, entradaFornecedor);
    }
  }

  public void entradaPreco() {
    for (int i = 0; i < getTamanhoPreco(); i++) {
      System.out.println("DIGITE PRECO DO" + getNome(i));
      double entradaPreco = leitor.nextDouble();
      setpreco(i, entradaPreco);
    }
  }

}
