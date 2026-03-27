package Model;

import java.util.ArrayList;

public class Hamburguer {

    private ArrayList<String> ing;
    private double Preco;

    public Hamburguer(ArrayList<String> ing, double preco) {
        this.ing = ing;
        Preco = preco;
    }

    public ArrayList<String> getIng() {
        return ing;
    }

    public void setIng(ArrayList<String> ing) {
        this.ing = ing;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }

    public String getlancheN(){
        return Preco +" " + ing;
    }
}