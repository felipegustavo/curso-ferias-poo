import java.util.Deque;
import java.util.LinkedList;

public class DequeExemplo {

    public static void main(String[] args) {
        Deque<Integer> filaPilha = new LinkedList<>();

        filaPilha.addLast(5);
        filaPilha.addLast(4);
        filaPilha.addLast(3);
        filaPilha.addFirst(1);
        filaPilha.addLast(0);
        filaPilha.push(10); // equivale a filaPilha.addLast

        System.out.println(filaPilha);

        var primeiroDaFila = filaPilha.removeFirst(); // equivale a filaPilha.poll();
        var ultimoDaFila = filaPilha.removeLast();

        System.out.println(filaPilha);
        System.out.println("Primeiro da fila: " + primeiroDaFila);
        System.out.println("Ultimo da fila: " + ultimoDaFila);
    }

}
