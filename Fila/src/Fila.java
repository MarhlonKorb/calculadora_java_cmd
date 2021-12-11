import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> Fila = new LinkedList<>();

        /*offer e add adicionam elementos a uma lista || Quando a lista está cheia*/
        Fila.add("");/*retorna uma exception*/
        Fila.add("Marthin");
        Fila.add("Mirihã");
        System.out.println(Fila.offer("Marhlon"));/*retorna NULL*/

        /*Obtém elementos de uma lista sem remover || Quando a lista está vazia*/
        System.out.println(Fila.peek()); /*retorna NULL*/
        System.out.println(Fila.element());/*retorna uma exception*/

        /*Retorna o primeiro elemento da fila já removendo*/
        System.out.println(Fila.poll());

        System.out.println(Fila.remove());/*Retorna true ou false*/
        System.out.println(Fila.isEmpty());
        System.out.println(Fila);
    }

}
