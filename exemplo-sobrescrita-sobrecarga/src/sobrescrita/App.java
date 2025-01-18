package sobrescrita;

public class App {
    
    public static void main(String[] args) {
        // referencia = new Instância()
        // referencia = Do mesmo tipo ou pai
        // referência = define os membros que podem ser vistos ou não

        // Só conseguimos dar new em classes concretas porque
        // é a instância que define a implementação
        Funcionario f1 = new FuncionarioCLT(123L, "Func CLT", 7500);
        Funcionario f2 = new FuncionarioPJBA(12345L, "Func PJ", 15000, 1234L);

        // f1.fazAlgo();

        System.out.println("Desconto  " + f1.getTipoFuncionario() + " " + f1.calculaDesconto());
        System.out.println("Desconto  " + f2.getTipoFuncionario() + " " + f2.calculaDesconto());
    }

}
