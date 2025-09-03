public class Produtos {

  private int id[];
  private String nome[];
  private int quantidade[];
  private double preco[];
  private String data[];

  public Produtos(int tamanhoStock) {
    this.nome = new String[tamanhoStock];
    this.id = new int[tamanhoStock];
    this.quantidade = new int[tamanhoStock];
    this.preco = new double[tamanhoStock];
    this.data = new String[tamanhoStock];
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
    this.quantidade[index] = entradaQuantidade;
  }

  public int getQuantiade(int index) {
    return this.quantidade[index];
  }

  public void setpreco(int index, double valor) {
    this.preco[index] = valor;
  }

  public double getPreco(int index) {
    return this.preco[index];
  }

  public void setData(int index, String data) {
    this.data[index] = data;
  }

  public String getData(int index) {
    return this.data[index];
  }
}
