public class Produto {
    private String nome;
    private String cod;
    private double preco;

    public Produto(String nome, String cod, double preco) {
        nome = this.nome;
        cod = this.cod;
        preco = this.preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
