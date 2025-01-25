package controle;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entidade.Pessoa;
import negocio.PessoaNegocio;

public class PessoaControle {

    private static final DateTimeFormatter FORMATTER_BRAZIL = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private PessoaNegocio negocio;
    private Scanner sc;

    public PessoaControle(Scanner sc) {
        this.sc = sc;
        negocio = new PessoaNegocio();
    }

    public void salvarArquivo() {
        negocio.salvarPessoas();
    }

    public void inserir() {
        System.out.println("Cadastro de Pessoa");

        System.out.println("Digite o nome da pessoa: ");
        String nome = sc.nextLine();

        System.out.println("Digite o cpf da pessoa: ");
        Long cpf = Long.parseLong(sc.nextLine());

        System.out.println("Digite a data de nascimento da pessoa: ");
        LocalDate nascimento = LocalDate.parse(sc.nextLine(), FORMATTER_BRAZIL);

        var p = new Pessoa(cpf, nome, nascimento);
        negocio.inserir(p);
    }

    public void excluir() {
        System.out.println("Excluir Pessoa");

        System.out.println("Digite o cpf da pessoa: ");
        Long cpf = Long.parseLong(sc.nextLine());

        negocio.remover(cpf);
    }

    public void mostarPessoas() {
        System.out.println("Pessoas Cadstradas");
        var pessoas = negocio.buscarPessoas();
        for (var p : pessoas) {
            System.out.println("""
                    ---------------------
                    Nome: %s
                    CPF: %s
                    Data Nascimento: %s
                    ---------------------
                    """.formatted(p.getNome(), p.getCpf(),
                    FORMATTER_BRAZIL.format(p.getDataNascimento())));
        }
    }

}
