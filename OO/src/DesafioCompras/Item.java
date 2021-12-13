package DesafioCompras;

public class Item {
    int quantidade = 0;

    Item(int quantidade){
        this.quantidade = quantidade;
    }

    int somaItem(){
        return this.quantidade++;
    }
}
