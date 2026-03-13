package Model;

import java.util.ArrayList;

public class Hamburguer {

    private ArrayList<String> ing;

    public Hamburguer(ArrayList<String> ing) {
        this.ing = ing;
    }

    public ArrayList<String> getIng() {
        return ing;
    }

    public void setIng(ArrayList<String> ing) {
        this.ing = ing;
    }
}