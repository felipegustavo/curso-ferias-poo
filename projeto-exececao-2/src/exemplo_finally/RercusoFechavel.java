package exemplo_finally;

import java.io.IOException;

public class RercusoFechavel implements AutoCloseable {

    @Override
    public void close() throws IOException {
        System.out.println("Fechando recurso!");
    }

}
