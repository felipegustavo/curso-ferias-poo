import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import entidade.Funcionario;

public class ExemploMap {

    public static void main(String[] args) {
        //Map<Long, Funcionario> map = new HashMap<>();
        //Map<Long, Funcionario> map2 = new HashMap<>();
        Map<Long, Funcionario> map = new TreeMap<>();
        Map<Long, Funcionario> map2 = new TreeMap<>();

        map2.put(1L, new Funcionario(1L, "A"));
        map2.put(2L, new Funcionario(2L, "B"));
        map2.put(3L, new Funcionario(3L, "C"));

        map.put(1L, new Funcionario(1L, "Novo A"));
        map.put(10L, new Funcionario(1L, "Novo A"));

        map.putAll(map2); 
        
        map.putIfAbsent(3L, new Funcionario(1L, "A"));

        var temp = map.get(10L);

        // só funciona pra HashMap
        //map.put(null, null);
        // map.clear(); limpa o mapa
        System.out.println(map);
        System.out.println("Teste contains key " + map.containsKey(10L));
        System.out.println("Teste contains valor " + map.containsValue(temp));
        
        System.out.println("get: " + temp);

        map.remove(1L);
        System.out.println(map);

        System.out.println("--------------------");
        for (Map.Entry<Long, Funcionario> elem : map.entrySet()) {
            System.out.printf("Chave: %s Valor: %s\n", elem.getKey(), elem.getValue());
        }
    }

}
