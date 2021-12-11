import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> Mapa = new HashMap<>();

        /*Metodo .put() para adicionar indice e valor*/
        Mapa.put(1,"Alcides");
        Mapa.put(2,"Alceu");
        Mapa.put(3,"Romeu");
        Mapa.put(4,"Jubileu");
        System.out.println(Mapa);

        /*Metodos para retornar indice e/ou valor*/
        System.out.println("\n"+ Mapa.size());
        System.out.println(Mapa.containsValue("Jubileu"));/*Verifica se um item está na lista*/
        System.out.println(Mapa.entrySet());/*retorna o índice*/
        System.out.println(Mapa.keySet());/*Retorna chave e valor da lista*/
        System.out.println(Mapa.get(4));
        System.out.println(Mapa);

        /*FOREACH pra retornar chave e valor*/
        for (Map.Entry<Integer, String> pessoas : Mapa.entrySet()
             ) {
            System.out.println(pessoas);
        }
        /*FOREACH para retornar os indices de um MAP*/
        for (int cadastro : Mapa.keySet()
             ) {
            System.out.println(cadastro);
        }

        /*FOREACH para retornar os valores de um MAP*/
        for (String nomeCadastro : Mapa.values()
             ) {
            System.out.println(nomeCadastro);
        }
    }
}
