import Model.Cliente;
import Model.Hamburguer;
import Model.Pedido;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> ingreList = new ArrayList<String>();
        ingreList.add("Pão");
        ingreList.add("Hamburguer");
        ingreList.add("ovo");
        ingreList.add("bacon");
        ingreList.add("queijo");


        Cliente cliente= new Cliente("Kauan", "Rodrigues");
        Hamburguer xhamburguer = new Hamburguer(ingreList, 50);

        Pedido pedido1 = new Pedido(cliente, xhamburguer);


        System.out.println(pedido1.getPedido());


    }
}
