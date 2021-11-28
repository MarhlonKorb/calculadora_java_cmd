package Classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto.desconto = 0.29;
        Produto A1 = new Produto("teclado",120);

        System.out.println(A1.precoComDesconto());
    }

}
