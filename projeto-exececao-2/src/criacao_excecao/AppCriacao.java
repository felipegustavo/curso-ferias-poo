package criacao_excecao;

public class AppCriacao {

    public static void lanca1() throws ExemploExcecaoChecada {
        throw new ExemploExcecaoChecada();
    }

    public static void main(String[] args) {
        try {
            lanca1();
        } catch (ExemploExcecaoChecada e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new ExemploExcecaoChecada("Não achei o livro com a quantidade", 10);
        } catch (ExemploExcecaoChecada e) {
            System.out.println(e.getMessage());
        }

        throw new EntidadeNaoEncontradaException("Livro", "12345");
    }

}
