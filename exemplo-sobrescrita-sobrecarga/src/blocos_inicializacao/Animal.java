package blocos_inicializacao;

public class Animal {

    // vem primeiro
    static { // 1
        System.out.println("Inicialização de estática de Animal");
    }

    // vem segundo
    { // 3 
        System.out.println("Inicialização de instância de Animal 1");
    }

    { // 4
        System.out.println("Inicialização de instância de Animal 2");
    }

    // vem terceiro
    public Animal() { // 5
        System.out.println("Construtor de Animal");
    }

}
