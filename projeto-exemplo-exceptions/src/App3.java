import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;

public class App3 {

    public static void main(String[] args) {
        try {
            String a = null;
            a.toString(); // vai gerar exception
            int n = 0 / 0;
            System.out.println("Nunca vai chamar");
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Erro genérico");
        }
    }

}
