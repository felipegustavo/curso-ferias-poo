package sobrecarga;

public class SobreCarga {

    // Sobre carga
    // Métodos com o mesmo nome mas com assinaturas diferentes
    // Uma classe não pode ter dois ou mais métodos com a mesma assinatura, ou seja, ela é única por class

    // fazAlgo = Nome do método
    // fazAlgo(String, int) = Assinatura do método
    public void fazAlgo(String str, int i) {

    }

    // Assinatura -> fazAlgo(String)
    public void fazAlgo(String str) {

    }

    public void escreveNaTela(String str) {
        System.out.println("String: " + str);
    }

    public void escreveNaTela(int i) {
        System.out.println("int: " + i);
    }

    public void escreveNaTela(double i) {
        System.out.println("double: " + i);
    }

    public void escreveNaTela(float i) {
        System.out.println("float: " + i);
    }

    public void escreveNaTela(long i) {
        System.out.println("long: " + i);
    }

    public double calculaDesconto(double salario) {
        return 0;
    }

    public double calculaDesconto(float salario) {
        calculaDesconto((double) salario);
        return 0;
    }

    public static void main(String[] args) throws Exception {
        var obj = new SobreCarga();

        obj.escreveNaTela("A");
        obj.escreveNaTela(1); // int
        obj.escreveNaTela(1L); // long
        obj.escreveNaTela(1.0); // double
        obj.escreveNaTela(1.0F); // float

        obj.calculaDesconto(1.0);
        obj.calculaDesconto(1.0F);
    }

}
