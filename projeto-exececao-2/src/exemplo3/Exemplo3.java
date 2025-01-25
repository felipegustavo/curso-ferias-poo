package exemplo3;

public class Exemplo3 {

    public static void main(String[] args) {
        try {
            int a = 0 / 1;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Executado o finally");
        }
    }

}
