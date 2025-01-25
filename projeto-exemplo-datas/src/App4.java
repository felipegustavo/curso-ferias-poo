import java.time.Instant;
import java.time.LocalDate;
import java.time.chrono.ChronoPeriod;
import java.time.temporal.ChronoUnit;

public class App4 {

    public static void main(String[] args) {
        Instant i1 = Instant.now();

        LocalDate hoje = LocalDate.now();
        LocalDate nascimento = LocalDate.of(1992, 8, 31);
        
        System.out.println(ChronoUnit.DAYS.between(nascimento, hoje));

        Instant i2 = Instant.now();
        System.out.println(ChronoUnit.MILLIS.between(i1, i2));
    }

}
