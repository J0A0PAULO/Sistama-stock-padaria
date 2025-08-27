public class main {
  public static void main(String[] args) {

    int tamanhoStock = EntradaPadariaStock.tamanhoStock();

    Produtos produtos = new Produtos(tamanhoStock);

    EntradaPadariaStock padariaStock = new EntradaPadariaStock(tamanhoStock);

  } 

}
