public class TesteComida {
    public static void main(String[] args) {
        Arroz arroz = new Arroz(0.300);
        Feijao feijao = new Feijao(0.150);
        Sorvete sorvete = new Sorvete(0.08);

        Pessoa Marhlon = new Pessoa(84.5);

        Marhlon.comer(arroz);
        Marhlon.comer(feijao);
        Marhlon.comer(sorvete);

        System.out.println(Marhlon.getPeso());
    }
}
