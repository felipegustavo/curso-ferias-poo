public class App1 {
    public static void main(String[] args) throws Exception {
        Funcionario f = null;

        // Null pointer Exception
        if (f != null) {
            System.out.println(f.cpf());
        }

        int b = 0;

        if (b != 0) {
            int a = 0 / b;
        }
    }
}
