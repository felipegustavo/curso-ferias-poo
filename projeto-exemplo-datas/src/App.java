import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        // yyyy - ano em 4 digitos, por exemplo 2025
        // yy - ano em 2 digitos, por exemplo 25
        // MM - mês sempre em 2 digitos, por exemplo 01, 10, 02
        // M - mês em número sem botar 0 a esquerda, por exemplo 1, 10, 2
        // dd - dias sempre com 2 digitos, por exemplo, 01, 10, 02
        // d - dia em número sem botar 0 a esquerda, por exemplo 1, 10, 2
        // LLL - nome do mês de forma reduzida
        // LLLL - nome do mês completo
        DateTimeFormatter dtfBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd 'de' LLL 'de' yy");

        LocalDate localDate = LocalDate.of(2025, 1, 25);
        LocalDate localDate2 = LocalDate.now();
        LocalDate localDate3 = LocalDate.parse("2025-01-25");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a data do seu nasmcimento");
        String dataNascimentoStr = sc.nextLine();
        LocalDate localDate4 = LocalDate.parse(dataNascimentoStr, dtfBrasil);

        System.out.println(dtfBrasil.format(localDate));
        System.out.println(localDate2);
        System.out.println(localDate3);
        System.out.println(dtfBrasil.format(localDate4));
        System.out.println(localDate4);
        System.out.println(dtf2.format(localDate4));

        sc.close();
    }
}
