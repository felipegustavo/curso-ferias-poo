package interfaces2;

public class FuncionarioCLT extends Funcionario implements DeclaracaoImpostoRenda {

    @Override
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

    @Override
    public void declararImpostoRenda() {
        System.out.println("Declaração CLT");
    }

}
