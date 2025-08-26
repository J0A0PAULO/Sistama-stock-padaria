public class Produtos {
  private String nome[];
  private int id[];
  private int quantidade[];

  public Produtos(String nome[], int id[], int quantidade, int tamanhoStock) {
    this.nome = new String[tamanhoStock];
    this.id = new int[tamanhoStock];
    this.quantidade = new int[tamanhoStock];
  }

  public void setNome(int index, String entradaNome) {
    this.nome[index] = entradaNome;
  }

  public String getNome(int index) {
    return this.nome[index];
  }

  public void setId(int index, int entradaID) {
    this.id[index] = entradaID;
  }

  public int getId(int index) {
    return this.id[index];
  }

  public void setQuantidade(int index, int entradaQuantidade) {
    
  }

}
