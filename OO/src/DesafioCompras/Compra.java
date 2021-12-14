package DesafioCompras;

import java.util.ArrayList;

public class Compra {

    ArrayList<Produto> produtos = new ArrayList<>();

    void adicionarProduto(Produto produto){
        this.produtos.add(produto);
        produto.Compra.add(this);
    }


    double gastoTotal(Produto produto ){
        for (Produto produtos : produtos
             ) {
            return produto.preco * produto.item.quantidade;
        }
        return gastoTotal(produto);
    }
}
