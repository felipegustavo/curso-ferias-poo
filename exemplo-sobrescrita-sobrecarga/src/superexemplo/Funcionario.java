package superexemplo;

public class Funcionario {

    private long cpf;
    protected String nome;

    public Funcionario() {
    }

    public Funcionario(long cpf, String nome) {
        this();
        this.cpf = cpf;
        this.nome = nome;
    }

    protected void fazAlgo() {
        System.out.println("Funcionario");
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

}
