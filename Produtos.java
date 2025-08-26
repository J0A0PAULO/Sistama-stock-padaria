public class Produtos {
  private String nome[];
  private int id[];
  private int quantidade[];
  private double preco[];
  private String fornecedor[];

  public Produtos(int tamanhoStock) {
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

  public void setFornecedor(int index, String fornecedor) {
    this.fornecedor[index] = fornecedor;
  }

  public String getFornecedor(int index) {
    return this.fornecedor[index];
  }

  public int getTamanhoNome() {
    return nome.length;
  }

  public int getTamanhoId() {
    return id.length;
  }

  public int getTamanhoQnt() {
    return nome.length;
  }

  public int getTamanhoFornecedor() {
    return this.fornecedor.length;
  }

  public int getTamanhoPreco() {
    return this.preco.length;
  }

}
