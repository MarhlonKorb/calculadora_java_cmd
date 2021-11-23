package Classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Tênis";
        p1.preco = 180;
        p1.desconto = 0.10;

        Produto p2 = new Produto();
        p2.nome = "camisa";
        p2.preco = 70;
        p2.desconto = 0.25;

        System.out.print(p1.nome);
    }
}
