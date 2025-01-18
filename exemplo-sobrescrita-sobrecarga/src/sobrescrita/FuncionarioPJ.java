package sobrescrita;

public abstract class FuncionarioPJ extends Funcionario {

    private long cnpj;

    public FuncionarioPJ(long cpf, String nome, double salario, long cnpj) {
        super(cpf, nome, salario);
        this.cnpj = cnpj;
    }

    @Override // sobrescrita
    public String getTipoFuncionario() {
        return "PJ";
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

}
