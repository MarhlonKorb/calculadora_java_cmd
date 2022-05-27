public class ParesTeste {
    public static void main(String[] args) {
        Pares<Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adicionar(1, "Maria");
        resultadoConcurso.adicionar(2, "Junin");
        resultadoConcurso.adicionar(3, "Mago");
        resultadoConcurso.adicionar(4, "Judas");
        resultadoConcurso.adicionar(5, "Marhlon");

        System.out.println(resultadoConcurso.getValor(1));
    }
}
