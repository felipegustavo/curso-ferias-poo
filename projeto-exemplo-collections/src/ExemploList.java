

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import entidade.Funcionario;

public class ExemploList {

    public static void main(String[] args) {
        // Experimente trocar ArrayList por LinkedList, não vai mudar nada no nosso código
        List<Funcionario> lista = new ArrayList<>(100);
        List<Funcionario> lista2 = new LinkedList<>();

        lista.add(new Funcionario(1L, "A")); // 0
        lista.add(new Funcionario(3L, "C")); // 1
        lista.add(new Funcionario(3L, "C")); // 2
        lista.add(new Funcionario(4L, "D")); // 3
        lista.add(new Funcionario(5L, "E")); // 4

        System.out.println("Teste add: " + lista.add(new Funcionario(1L, "A")));
        System.out.println("Teste add: " + lista.add(new Funcionario(1L, "A")));
        System.out.println("Teste add: " + lista.add(new Funcionario(1L, "A")));

        //System.out.println(lista);

        lista.set(1, new Funcionario(2L, "B"));

        lista.remove(3);

        var temp = new Funcionario(1L, "A");

        System.out.println(lista);
        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println("Checar se lista está vazia método 1 " + (lista.size() == 0));
        System.out.println("Checar se lista está vazia método 2 " + lista.isEmpty());
        System.out.println(lista.get(lista.size() - 1));
        System.out.println(lista.get(1)); // array[1]
        System.out.println("Contains: " + lista.contains(temp));
        System.out.println("IndexOf: " + lista.indexOf(temp));

        lista.remove(temp);
        System.out.println(lista);

        lista2.add(new Funcionario(6L, "F"));
        lista2.add(new Funcionario(7L, "G"));
        lista2.add(new Funcionario(8L, "H"));

        lista.addAll(lista2);
        System.out.println(lista);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Elemento " + i + ": " + lista.get(i));
        }

        System.out.println("-----------------");
        System.out.println("For Each");
        for (var e : lista) {
            System.out.println("Elemento: " + e);
        }

        List<Integer> inteiros = new ArrayList<>();
        inteiros.add(0);
        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(2);
        inteiros.add(2);
        inteiros.add(3);

        System.out.println(inteiros);

        inteiros.remove(0); // isso pro java é int, vai chamar remove(int)
        inteiros.remove((Integer) 3); // vai chamar remove(Object0)

        System.out.println(inteiros);
        System.out.println("Teste contains: " + inteiros.contains(2));
    }

}
