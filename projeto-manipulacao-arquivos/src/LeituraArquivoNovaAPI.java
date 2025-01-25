import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeituraArquivoNovaAPI {

    private static final String ARQUIVO = "Funcionarios.txt";

    public static void main(String[] args) {
        try {
            var path = Paths.get(ARQUIVO);

            List<String> linhas = Files.readAllLines(path);
            linhas.add("João");
            linhas.add("Jorge");
            
            Files.write(path, linhas);
            //Files.writeString(path, "ABC");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
