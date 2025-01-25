import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class App {

    private static final String ARQUIVO = "pessoas.bin";

    public static void main(String[] args) throws Exception {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa(1, "A"));
        pessoas.add(new Pessoa(2, "B"));
        pessoas.add(new Pessoa(3, "C"));
        pessoas.add(new Pessoa(4, "D"));
        pessoas.add(new Pessoa(5, "E"));

        escreveObjetoArquivo(pessoas);
        List<Pessoa> novasPessoas = lerObjetoArquivo();
        System.out.println(novasPessoas);
    }

    public static void escreveObjetoArquivo(List<Pessoa> pessoas) {
        try (
            FileOutputStream fos = new FileOutputStream(ARQUIVO);
            ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            oos.writeObject(pessoas);
            oos.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static List<Pessoa> lerObjetoArquivo() {
        try (
            FileInputStream fis = new FileInputStream(ARQUIVO);
            ObjectInputStream ois = new ObjectInputStream(fis); 
        ) {
            return (List<Pessoa>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


}
