public class Item {
    private String nome;
    private double valor;
    private boolean isProduto;

    public Item(String nome, double valor, boolean isProduto) {
        this.nome = nome;
        this.valor = valor;
        this.isProduto = isProduto;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public boolean isProduto() {
        return isProduto;
    }
}
