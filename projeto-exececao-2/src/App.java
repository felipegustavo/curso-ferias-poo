public class App {
    public static void main(String[] args) {
        try {
            int b = 0 / 0;
            String a = "abc";
            if (a != null) {
                System.out.println(a.toString());
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch(ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
