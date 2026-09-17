import java.util.*;

public class Fatura {
    ArrayList<Item> listItem;
    double totalfatura;

    public Fatura(ArrayList<Item> listItem, double totalfatura) {
        this.listItem = new ArrayList<>();
        this.totalfatura = totalfatura;
    }

    public double calcularTotalFatura() {
        double soma = 0.0;
        for (Item i : listItem) {
            soma = i.getValorTotal();
        }
        this.totalfatura = soma;
        return this.totalfatura;
    }

    public ArrayList<Item> getListItem() {
        return listItem;
    }

    public void setListItem(ArrayList<Item> listItem) {
        this.listItem = listItem;
    }

    public double getTotalfatura() {
        return totalfatura;
    }

    public void setTotalfatura(double totalfatura) {
        this.totalfatura = totalfatura;
    }

}