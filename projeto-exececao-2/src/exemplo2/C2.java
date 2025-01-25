package exemplo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class C2 {

    void lancaExcecaoChecada() throws FileNotFoundException {
        new FileReader(new File("null"));
    }    

}
