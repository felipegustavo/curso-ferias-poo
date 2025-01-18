package blocos_inicializacao;

public class App7 {

    // Ordem de escrita
    /*
     * Inicialização de estática de Animal
        Inicialização de estática de Mamifero
        Inicialização de estática de Cachorro
        Inicialização de instância de Animal 1
        Inicialização de instância de Animal 2
        Construtor de Animal
        Inicialização de instância de Mamifero
        Construtor de mamifero
        Inicialização de instância de Cachorro
        Construtor de cachorro
     */
    public static void main(String[] args) {
        new Cachorro();
    }

}
