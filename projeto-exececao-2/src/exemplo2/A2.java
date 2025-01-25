package exemplo2;

import java.io.FileNotFoundException;

public class A2 {

    private B2 b;

    public A2(B2 b) {
        this.b = b;
    }

    void lancaExcecaoChecada() throws FileNotFoundException {
        b.lancaExcecaoChecada();
    }

    public static void main(String[] args) {
        var c = new C2();
        var b = new B2(c);
        var a = new A2(b);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                a.lancaExcecaoChecada();  
            } catch (Exception e) {
                System.out.println("Houve um erro: " + e.getMessage());
            }
        }
    }

}
