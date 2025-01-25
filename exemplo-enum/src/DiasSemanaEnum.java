public enum DiasSemanaEnum {

    DOMINGO(1, "Domingo"),
    SEGUNDA(2, "Segunda-feira"),
    TERCA(3, "Terça-feira"),
    QUARTA(4, "Quarta-feira"),
    QUINTA(5, "Quinta-feira"),
    SEXTA(6, "Sexta-feira"),
    SABADO(7, "Sábado");

    private String str;
    private int num;

    private DiasSemanaEnum(int num, String str) {
        this.num = num;
        this.str = str;
    }

    public String getTela() {
        return str;
    }

    public int getNum() {
        return num;
    }

}
