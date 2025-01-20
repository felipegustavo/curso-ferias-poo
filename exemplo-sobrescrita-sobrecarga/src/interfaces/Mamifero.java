package interfaces;

public interface Mamifero extends Animal, OutraInterface {

    // public implicito
    // static implicito
    // final implicito
    int count = 1;

    // equivalente ao de cima
    public static final int count2 = 1;

    // sempre será public, por isso não precisa colocar, mas pode se quiser
    void fazSom();

    public static void fazAlgo() {
        System.out.println("Só pode ter para caras estáticos");
    }

    default void fazAlgoPadrao() {
        System.out.println("Comportamento de qualquer animal");
    }
    
}
