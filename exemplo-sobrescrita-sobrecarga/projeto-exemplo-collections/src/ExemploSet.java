import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import entidade.Funcionario;

public class ExemploSet {

    public static void main(String[] args) {
        // Set<Funcionario> set = new HashSet<>();
        Set<Funcionario> set = new TreeSet<>();

        set.add(new Funcionario(3L, "C")); 
        set.add(new Funcionario(4L, "D")); 
        set.add(new Funcionario(5L, "B"));
        set.add(new Funcionario(2L, "B")); 
        set.add(new Funcionario(1L, "A"));
        set.add(new Funcionario(3L, "C")); 

        // quebra o treeset
        //set.add(null);        
         
        System.out.println("Teste add: " + set.add(new Funcionario(1L, "A")));
        System.out.println("Teste add: " + set.add(new Funcionario(6L, "F")));

        var temp = new Funcionario(1L, "A");

        set.remove(temp);
        set.size();
        set.isEmpty();
        set.contains(temp);

        List<Funcionario> lista = new ArrayList<>();
        lista.add(new Funcionario(10L, "H"));

        set.addAll(lista);

        set.add(new Funcionario(1L, "A"));

        for (var e : set) {
            System.out.println("Elemento: " + e);
        }

        System.out.println("-----------------");
        System.out.println("Iterator");

        Iterator<Funcionario> it = set.iterator();
        while (it.hasNext()) {
            Funcionario f = it.next();
            System.out.println("Elemento: " + f);
        }
    }

}
