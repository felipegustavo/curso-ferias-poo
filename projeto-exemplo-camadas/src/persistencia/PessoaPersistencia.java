package persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import entidade.Pessoa;

public class PessoaPersistencia {

    private static final String ARQUIVO = "pessoas.bin";
    private List<Pessoa> pessoas;

    public PessoaPersistencia() {
        this.pessoas = new ArrayList<>();
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void salvaPessoas() {
        try (
            FileOutputStream fos = new FileOutputStream(ARQUIVO);
            ObjectOutputStream ous = new ObjectOutputStream(fos)
        ) {
            ous.writeObject(pessoas);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void carregaPessoas() {
        try(
            FileInputStream fis = new FileInputStream(ARQUIVO);
            ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            pessoas = (List<Pessoa>) ois.readObject();
        } catch (IOException | ClassNotFoundException  e) {
            e.printStackTrace();
        }
    }

}
