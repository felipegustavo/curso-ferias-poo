package exemplo_finally;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExemploLeituraArquivoTryWithResources {

    public static void main(String[] args) {
        // Só podemos usar try-with resouces com classes que implementem
        // as interfaces Closable ou AutoClosable
        try (var fr = new FileReader("Funcionarios.txt");
            var bf = new BufferedReader(fr);
            var r = new RercusoFechavel()){

            // outras classes para dar new
            
            String linha;
            List<String> lista = new ArrayList<>();
            while ((linha = bf.readLine()) != null) {
                System.out.println(linha);
                lista.add(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Depois de fechar tudo!");
        }
    }

}
