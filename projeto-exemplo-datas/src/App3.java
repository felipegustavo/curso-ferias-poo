import java.time.LocalDate;

public class App3 {

    public static void main(String[] args) {
        LocalDate data1 = LocalDate.of(2025, 1, 25);
        LocalDate data2 = LocalDate.of(2024, 1, 12);

        System.out.println(data1.compareTo(data2));
        System.out.println(data1.isAfter(data2));
        System.out.println(data1.isBefore(data2));
        System.out.println(data1.isEqual(data2));
    }

}
