import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App2 {

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern(" h:mm:ss a");        

        LocalTime lt = LocalTime.now();
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2025, 1, 25, 14, 34, 0);
        Instant ins = Instant.now();

        System.out.println(dtf2.format(lt));
        System.out.println(lt);
        System.out.println(dtf.format(ldt));
        System.out.println(ins);

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a data e hora do seu nasmcimento");
        String dataHoraNascimentoStr = sc.nextLine();
        LocalDateTime dataHoraNascimento = LocalDateTime.parse(dataHoraNascimentoStr, dtf);

        System.out.println(dataHoraNascimento);

        sc.close();
    }

}
