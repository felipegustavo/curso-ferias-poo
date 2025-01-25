package exemplo1;

public class B1 {

    private C1 c;

    public B1(C1 c) {
        this.c = c;
    }

    void lancaExcecaoNaoChecada() {
        c.lancaExcecaoNaoChecada();
    }

}
