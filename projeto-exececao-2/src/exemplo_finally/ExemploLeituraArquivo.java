package exemplo_finally;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExemploLeituraArquivo {

    public static void main(String[] args) {
        
        BufferedReader bf = null;

        try {
            var fr = new FileReader("Funcionarios.txt");
            bf = new BufferedReader(fr);
            String linha;
            while ((linha = bf.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bf != null) {
                try {
                    bf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
