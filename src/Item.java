public class Item {
    private Produto produto;
    private double quantidade;
    private double valortotal;
    private double total;

    public Item(Produto produto, double quantidade, double valortotal) {
        produto = this.produto;
        quantidade = this.quantidade;
        valortotal = 0;
    }

    double calcularTotal() {
        this.total = getQuantidade() * getProduto().getPreco();
        return total;

    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getValortotal() {
        return valortotal;
    }

    public void setValortotal(double valortotal) {
        this.valortotal = valortotal;
    }
}
