import java.util.Scanner;

import controle.PessoaControle;

public class App {

    private Scanner sc;
    private PessoaControle pessoaControle;
    
    public App() {
        sc = new Scanner(System.in);
        pessoaControle = new PessoaControle(sc);
    }

    public int realizaOperacoes() {
        System.out.println("Menu do sistema");
        System.out.println("------------------");
        System.out.println("1 - Inserir pessoa");
        System.out.println("2 - Remover pessoa");
        System.out.println("3 - Mostrar pessoas");
        System.out.println("4 - Sair");
        System.out.println("------------------");
        
        int op = Integer.valueOf(sc.nextLine());

        switch (op) {
            case 1:
                pessoaControle.inserir();
                break;
            case 2:
                pessoaControle.excluir();
                break;
            case 3:
                pessoaControle.mostarPessoas();
                break;
            default:
                break;
        }

        return op;
    }

    public static void main(String[] args) {
        var app = new App();
        while (true) {
            try {
                int op = app.realizaOperacoes();
                if (op == 4) { // acaba o programa
                    break;
                }
            } catch (Exception e) {
                System.out.println("Houve um erro");
                System.out.println(e.getMessage());
            }
        }
        
        app.sc.close();
        app.pessoaControle.salvarArquivo();
    }
}
