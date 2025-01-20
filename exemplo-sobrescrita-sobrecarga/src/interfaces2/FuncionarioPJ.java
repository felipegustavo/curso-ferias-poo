package interfaces2;

public class FuncionarioPJ extends Funcionario implements DeclaracaoImpostoRenda {

    @Override
    public double calculaDesconto() {
        return salario * 0.05;
    }

    @Override
    public void declararImpostoRenda() {
        System.out.println("Declaração PJ");
    }

}
