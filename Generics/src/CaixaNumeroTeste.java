public class CaixaNumeroTeste {
    public static void main(String[] args) {
        CaixaNumero<Double> caixaA = new CaixaNumero<>();
        caixaA.guardar(123.1);
        System.out.println(caixaA);

        CaixaNumero<Double> caixaB = new CaixaNumero<>();
        caixaB.guardar(215.1);
        System.out.println(caixaB);
    }
}
