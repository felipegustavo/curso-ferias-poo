package superexemplo;

public class FuncionarioPJ extends Funcionario {

    protected String nome = "ABC";

    public FuncionarioPJ(long cpf, String nome) {
        super(cpf, nome);
    }

    // não pode ter uma visibilidade menor do que o método que sobreescreve
    // public - maior visibilidade  - ver em todo lugar
    // protected - menor que a public - ver dentro do mesmo pacote e herança
    // default - menor que a protected - ver dentro do mesmo pacote
    // private - sem visibilidade - só ver dentro da classe
    @Override
    public void fazAlgo() {
        System.out.println("FuncionarioPJ");
        super.fazAlgo();
        System.out.println(super.nome);
        System.out.println(this.nome);
    }

}
