public class App2 {

    public static void main(String[] args) {
        try {
            String a = null;
            a.toString(); // vai gerar exception
            int n = 0 / 0;
            System.out.println("Nunca vai chamar");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        }
    }

}
