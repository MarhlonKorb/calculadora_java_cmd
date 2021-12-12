package Compras;

import java.util.ArrayList;

public class TesteCompra {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Marhlon");
        Compra c1 = new Compra();

        c1.itens.add(new Item("Arroz",3,16));
        c1.itens.add(new Item("Feijão",2,7));
        System.out.println(c1.precoTotal());

    }

}
