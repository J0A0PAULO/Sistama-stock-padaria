import java.util.Scanner;

public class EntradaPadariaStock extends Produtos {

  public static Scanner leitor = new Scanner(System.in);

  public EntradaPadariaStock(int tamanhoStock) {
    super(tamanhoStock);
  }

  public static int tamanhoStock() {
    System.out.println("qual tamanho que o estoque tera?");
    return leitor.nextInt();
  }

  public void cadastrarIngredientes(int tamanhoStock) {

    for (int i = 0; i < tamanhoStock; i++) {

      leitor.nextLine();

      System.out.println("CADASTRE ID DO PRODUTO");
      int cadastraId = leitor.nextInt();
      setId(i, cadastraId);

      leitor.nextLine();

      System.out.println("CADASTRE NOME DO PRODUTO");
      String cadastrarNome = leitor.nextLine();
      setNome(i, cadastrarNome);

      System.out.printf("CADASTRE QUANTIDADE DE %s \n", getNome(i));
      int cadastraQuantidade = leitor.nextInt();
      setQuantidade(i, cadastraQuantidade);

      System.out.printf("CADASTRE O PREÇO %s \n", getNome(i));
      double cadastrePreco = leitor.nextDouble();
      setpreco(i, cadastrePreco);

      System.out.printf("CADASTRE A DATA DE VALIDADE ");
      String cadastrarData = leitor.nextLine();
      setData(i, cadastrarData);

      System.out.println("CADASTRO " + i);

    }
  }

}
