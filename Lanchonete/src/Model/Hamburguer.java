package Model;

public class Hamburguer {

    private String Ingred1;
    private String Ingred2;
    private String Ingred3;
    private String Ingred4;

    public Hamburguer(String ingred1, String ingred2, String ingred4, String ingred3) {
        Ingred1 = ingred1;
        Ingred2 = ingred2;
        Ingred4 = ingred4;
        Ingred3 = ingred3;
    }

    public String getLancheInteiro(){
        return Ingred1 + "," + Ingred2 + "," + Ingred3 + "," + Ingred4;                                                                                                                                                                                                                                                                                                                                                    



    }

}
