package interfaces2;

public abstract class Funcionario {

    protected String nome;
    protected long cpf;
    protected double salario;

    public abstract double calculaDesconto();

    public void fazAlgo() {
        System.out.println("Teste");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
