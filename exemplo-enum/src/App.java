import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String dia = DiasSemana.SEGUNDA; // pega string de algum canto
        int diaNum = DiasSemana.DOMINGO_NUM;

        if (dia.equals(DiasSemana2.SEGUNDA)) {
            System.out.println("é segunda");
        }

        DiasSemanaEnum diaEnum = DiasSemanaEnum.SEGUNDA;
        if (DiasSemanaEnum.SEGUNDA.equals(diaEnum)) {
            System.out.println("é segunda");
        }

        System.out.println(DiasSemana.SEGUNDA);
        System.out.println(DiasSemanaEnum.SEGUNDA);

        System.out.println(DiasSemanaEnum.SEGUNDA.getNum());
        System.out.println(DiasSemanaEnum.SEGUNDA.getTela());

        System.out.println("Digite o dia da semana");
        var sc = new Scanner(System.in);
        var input = sc.nextLine();

        var diaInput = DiasSemanaEnum.valueOf(input);
        System.out.println(diaInput.getNum());
    }

    public boolean ehFimSemana(DiasSemanaEnum dia) {
        return DiasSemanaEnum.DOMINGO.equals(dia) || DiasSemanaEnum.SABADO.equals(dia);
    } 

}
