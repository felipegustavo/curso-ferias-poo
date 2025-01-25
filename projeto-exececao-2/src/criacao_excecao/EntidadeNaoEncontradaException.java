package criacao_excecao;

public class EntidadeNaoEncontradaException extends RegraNegocioException {

    public EntidadeNaoEncontradaException(String nome, String id) {
        super("Não foi possível encontrar a entidade " + nome + " com id " + id);
    }

}
