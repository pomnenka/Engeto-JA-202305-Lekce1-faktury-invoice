import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String item;
        int quantity;
        double weight;
        double pricePerPiece;
        LocalDate dateOfIssue;
        Boolean isDiscounted;

        item = "Trekové boty Sedmimílovky";
        quantity = 3;
        weight = 0.45;
        pricePerPiece = 1800;
        dateOfIssue = LocalDate.of(2022, 4, 7);
        isDiscounted = Boolean.TRUE;

        quantity = 2;
        pricePerPiece = 1990;
        System.out.println("celková hmotnost zásilky: " + quantity*weight);


    }
}