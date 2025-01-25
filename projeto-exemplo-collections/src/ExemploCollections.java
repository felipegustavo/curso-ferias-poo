import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploCollections {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.addAll(List.of(4, 1, 9, 3, 6, 5, 2, 0));

        var maiorNumero = Collections.max(numeros);
        var menorNumero = Collections.min(numeros);
        Collections.sort(numeros, (a, b) -> b - a);

        System.out.println("Maior: " + maiorNumero);
        System.out.println("Menor: " + menorNumero);
        System.out.println("Lista ordenada: " + numeros);
    }

}
