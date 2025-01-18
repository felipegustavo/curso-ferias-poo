package shadowing;

public class App5 {

    private int x = 1;

    // shawdoing
    private void m() {
        int x = 10; // variável local

        System.out.println(x);
        System.out.println(this.x);
    }

    public final static void main(String[] args) {
        new App5().m();
    }

}
