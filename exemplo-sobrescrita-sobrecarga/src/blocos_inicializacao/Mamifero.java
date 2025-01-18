package blocos_inicializacao;

public class Mamifero extends Animal {

    // vem primeiro
    static {
        System.out.println("Inicialização de estática de Mamifero");
    }

    // vem segundo
    {
        System.out.println("Inicialização de instância de Mamifero");
    }

    public Mamifero() {
        System.out.println("Construtor de mamifero");
    }

}
