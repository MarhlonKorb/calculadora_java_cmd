public class CaixaInt extends Caixa <Integer> {
    public static void main(String[] args) {
        CaixaInt caixaA = new CaixaInt();
        caixaA.guardar(123);

        Integer coisaA = caixaA.abrir();
        System.out.println(coisaA);
    }
}
