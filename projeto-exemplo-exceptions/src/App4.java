import java.io.FileReader;
import java.io.IOException;

public class App4 {

    public static void main(String[] args) {
        try {
            var b = new FileReader("ssf");
            b.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
