package exemplo1;

public class A1 {

    private B1 b;

    public A1(B1 b) {
        this.b = b;
    }

    void lancaExcecaoNaoChecada() {
        b.lancaExcecaoNaoChecada();
    }

    public static void main(String[] args) {
        var c = new C1();
        var b = new B1(c);
        var a = new A1(b);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                a.lancaExcecaoNaoChecada();
            } catch (Exception e) {
                System.out.println("Houve um erro: " + e.getMessage());
            }
            
        }
    }

}
