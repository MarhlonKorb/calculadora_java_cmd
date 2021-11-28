public class Jantar {
    public static void main(String[] args) {
        Pessoa Cliente = new Pessoa("Marhlon", 84.0);
        Comida comida = new Comida("Arroz",0.300);

        System.out.println(Cliente.apresentar());
        Cliente.Comer(comida);
        System.out.println(Cliente.apresentar());
    }
}
