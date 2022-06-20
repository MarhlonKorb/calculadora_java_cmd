package DesafioCompras;

import java.util.ArrayList;

public class Produto {
    String nome;
    double preco;
    Item item;

    Produto(){
    }

    Produto(String nome, double preco,Item item){
        this.nome = nome;
        this.preco = preco;
        this.item.quantidade = item.quantidade;
    }

    ArrayList<Compra> Compra = new ArrayList<>();

    void adicionarCompra(Compra compra){
        this.Compra.add(compra);
        compra.produtos.add(this);
    }
}
