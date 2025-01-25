package exemplo_finally;

import java.io.FileWriter;
import java.io.IOException;

public class ExemploEscritaArquivoTryWithResources {

    public static void main(String[] args) {
        // Só podemos usar try-with resouces com classes que implementem
        // as interfaces Closable ou AutoClosable
        // colocar true para fazer append, botar no final do arquivo
        // var fr = new FileWriter("Funcionarios.txt", true);
        // E não coloque nada para zerar o arquivo quando abrir
        // var fr = new FileWriter("Funcionarios.txt");
        try (var fr = new FileWriter("Funcionarios.txt", true);){

            fr.write("\nSobreescrevi o arquivo"); // escreve no fim do arquivo
            fr.append("\nFulano");
            fr.append("\nCiclano");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Depois de fechar tudo!");
        }
    }

}
