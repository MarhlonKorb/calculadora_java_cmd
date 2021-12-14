package DesafioCompras;

import java.util.ArrayList;

public class Cliente {
        String nome;

        Cliente(String nome){
            this.nome = nome;
        }

        ArrayList<Compra> listaCompra = new ArrayList<>();

        void adicionaCompra(Compra compra){
            this.listaCompra.add(compra);

        }
}
