package excecoes;

public class EntidadeDuplicadaException extends RuntimeException {

    public EntidadeDuplicadaException(String entidade, Object chave) {
        super("Entidade %s  duplicada com chave %s.".formatted(entidade, chave));
    }

}
