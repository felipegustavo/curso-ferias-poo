package superexemplo;

public class App2 {

    static void metodoDefault() {}

    public static void main(String[] args) {
        Funcionario f = new FuncionarioPJ(1L, "Felipe");
        f.fazAlgo();

        // uso do super
        System.out.println(f.toString());
    }

}
