package exemplo2;

import java.io.FileNotFoundException;

public class B2 {

    private C2 c;

    public B2(C2 c) {
        this.c = c;
    }

    void lancaExcecaoChecada() throws FileNotFoundException {
        c.lancaExcecaoChecada();
    }

}
