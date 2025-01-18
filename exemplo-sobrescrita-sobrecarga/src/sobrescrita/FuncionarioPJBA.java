package sobrescrita;

public class FuncionarioPJBA extends FuncionarioPJ {

    public FuncionarioPJBA(long cpf, String nome, double salario, long cnpj) {
        super(cpf, nome, salario, cnpj);
    }

    @Override
    public double calculaDesconto() {
        return salario * 0.05;
    }

}
