package excecoes;

public class EntidadeNaoEncontradaException extends RuntimeException {

    public EntidadeNaoEncontradaException(String entidade, Object chave) {
        super("Não foi possível achar entidade %s com chave %s.".formatted(entidade, chave));
    }

}
