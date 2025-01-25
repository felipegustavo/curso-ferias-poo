package criacao_excecao;

public class ExemploExcecaoChecada extends Exception {

    public ExemploExcecaoChecada(String msg, int qtd) {
        super(msg + ": " + qtd);
    }

    public ExemploExcecaoChecada() {
        super("Mensagem padrão da minha exceção.");
    }

}
