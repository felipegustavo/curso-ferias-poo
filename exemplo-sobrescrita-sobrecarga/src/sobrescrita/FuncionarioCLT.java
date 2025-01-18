package sobrescrita;

public class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(long cpf, String nome, double salario) {
        super(cpf, nome, salario);
    }

    public void fazAlgo() {}

    // sobrescrita
    @Override // é bom colocar pois indica erros no uso de sobrescrita, não obrigatório
    public double calculaDesconto() {
        if (salario < 2500) {
            return 0;
        } else if (salario <= 5000) {
            return salario * 0.1;
        } else if (salario <= 10000) {
            return salario * 0.15;
        }
        return salario * 0.2;
    }

}
