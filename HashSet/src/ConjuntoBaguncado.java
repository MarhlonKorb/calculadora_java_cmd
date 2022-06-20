import java.util.HashSet;

public class ConjuntoBaguncado {

    /*a classe não garante a ordem constante dos elementos ao longo do tempo e não aceita valores duplicados
    * permite o elemento nulo
    * */
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add("Judas");
        conjunto.add(true);
        conjunto.add(0);
        System.out.print(conjunto.contains(conjunto));
        System.out.print("\n"+conjunto.size());
        System.out.print("\n"+conjunto);
    }

}
