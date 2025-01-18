package instanceof_e_final;

import sobrescrita.Funcionario;
import sobrescrita.FuncionarioCLT;
import sobrescrita.FuncionarioPJ;
import sobrescrita.FuncionarioPJBA;

public class App3 extends ClassMethodFinal {

    public static void main(String[] args) {
        System.out.println(DiasSemana.SEGUNDA);

        final int i = 10; // constante

        Object l = new Leao();

        if (l instanceof String) {
            System.out.println("é um animal");
        } else {
            System.out.println("Não sou uma instância");
        }

        recebeFuncionario(new FuncionarioCLT(1l, null, 0));
        recebeFuncionario(new FuncionarioPJBA(0, null, 0, 0));
    }


    // não posso sobrescrever método
    /*@Override
    public void fazAlgo() {

    }*/

    public static void recebeFuncionario(Funcionario f) {
        if (f instanceof FuncionarioPJ) {
            System.out.println("vc é PJ");
        } else if (f instanceof FuncionarioCLT) {
            System.out.println("vc é CLT");
        } else {
            System.out.println("Não sei o seu tipo");
        }
    }

}
