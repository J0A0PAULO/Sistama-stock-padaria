import java.util.Scanner;

public class PadariaStock extends Produtos {

  public static Scanner leitor = new Scanner(System.in);

  public static int tamanhoStock() {
    return leitor.nextInt();
  }

  public static void nome(String nome[]) {
    System.out.println("digite seu nome");
    for (int i = 0; i < nome.length; i++) {
      nome[i] = leitor.nextLine();
    }
  }

  public static void id(int id[]) {
    for (int i = 0; i < id.length; i++) {
      id[i] = leitor.nextInt();
    }
  }

  public static void quantidade(int quantidade[]) {

  }

}
