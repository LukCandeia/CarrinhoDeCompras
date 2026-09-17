public class Item {
    private Produto produto;
    private double quantidade;
    private double valortotal;

    public Item(Produto produto, double quantidade, double valortotal) {
        produto = this.produto;
        quantidade = this.quantidade;
        valortotal = 0;
    }

    double getValorTotal() {
        this.valortotal = getQuantidade() * getProduto().getPreco();
        return valortotal;

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
