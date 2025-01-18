package blocos_inicializacao;

public class Cachorro extends Mamifero {

    // vem primeiro
    static { // 2
        System.out.println("Inicialização de estática de Cachorro");
    }

    // vem segundo
    { // 6
        System.out.println("Inicialização de instância de Cachorro");
    }

    public Cachorro() { // 7
        System.out.println("Construtor de cachorro");
    }

}
