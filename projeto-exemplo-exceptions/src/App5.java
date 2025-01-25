import java.util.Scanner;

public class App5 {

    public static void main(String[] args) {
        int a; 
        int b;
        var sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite os valores de a e b");
            a = sc.nextInt();
            b = sc.nextInt();

            try {
                System.out.println("Resultado: " + (a / b));
            } catch (ArithmeticException e) {
                System.out.println("Não pode fazer divisão por 0");
            }

        }
    }

}
