package interfaces;

public class CachorroAlienigina implements Mamifero, Oviparo {

    // só preciso implementar uma vez
    // pois assinatura bate com os dois métodos das interfaces
    @Override
    public void fazSom() {
        System.out.println("Au Au Au");
    }

    @Override
    public void colocarOvo() {
        System.out.println("Colocando ovo");
    }

    @Override
    public void fazCoisaNova() {
        System.out.println("Fazendo algo");
    }

}
