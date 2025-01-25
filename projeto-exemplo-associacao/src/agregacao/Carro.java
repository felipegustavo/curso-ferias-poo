package agregacao;

import java.util.List;

public class Carro {

    private Motor motor;
    private List<Roda> rodas;
    private List<Porta> portas;

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public List<Roda> getRodas() {
        return rodas;
    }

    public void setRodas(List<Roda> rodas) {
        this.rodas = rodas;
    }

    public List<Porta> getPortas() {
        return portas;
    }

    public void setPortas(List<Porta> portas) {
        this.portas = portas;
    }

}
