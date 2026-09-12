import java.util.*;

public class Fatura {
    ArrayList<Produto> listProdutos;
    double totalfatura;

    public Fatura(ArrayList<Produto> listProdutos, double totalfatura) {
        this.listProdutos = new ArrayList<>();
        this.totalfatura = totalfatura;
    }

    public ArrayList<Produto> getListProdutos() {
        return listProdutos;
    }

    public void setListProdutos(ArrayList<Produto> listProdutos) {
        this.listProdutos = listProdutos;
    }

    public double getTotalfatura() {
        return totalfatura;
    }

    public void setTotalfatura(double totalfatura) {
        this.totalfatura = totalfatura;
    }

}