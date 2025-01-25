import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App2 {

    public static void main(String[] args) {
        try {
            new FileReader(new File(""));
        } catch (FileNotFoundException e) {
            System.out.println("Houve um erro, escolha outro arquivo.");
        }
    }

}
