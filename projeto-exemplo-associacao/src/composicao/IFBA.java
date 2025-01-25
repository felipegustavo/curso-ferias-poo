package composicao;

import java.util.List;

public class IFBA {

    private List<Departamento> departamentos;
    private List<SalaAula> salas;

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public List<SalaAula> getSalas() {
        return salas;
    }

    public void setSalas(List<SalaAula> salas) {
        this.salas = salas;
    }

}
