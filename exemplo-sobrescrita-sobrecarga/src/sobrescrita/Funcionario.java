package sobrescrita;

public abstract class Funcionario {

    protected long cpf;
    protected String nome;
    protected double salario;

    public abstract double calculaDesconto();

    public String getTipoFuncionario() {
        return "CLT";
    }

    public Funcionario(long cpf, String nome, double salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
