import java.util.Locale;
import java.util.Scanner;

public class Cantina {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        // Meniul zilei
        String[] produse = {
                "Zeama de casa",
                "Piure cu parjoala",
                "Salata de varza",
                "Compot"
        };

        double[] preturi = {
                24.50,
                46.00,
                18.00,
                12.00
        };

        System.out.println("=== MENIUL ZILEI ===");

        for (int i = 0; i < produse.length; i++) {
            System.out.printf("%-25s %6.2f lei%n", produse[i], preturi[i]);
        }

        System.out.println();

        // Citirea pozitiei
        System.out.print("Alege pozitia (1-4): ");
        int pozitie = scanner.nextInt();

        if (pozitie < 1 || pozitie > 4) {
            System.out.println("Pozitie invalida!");
            return;
        }

        System.out.print("Numar portii: ");
        int portii = scanner.nextInt();

        double costTotal = preturi[pozitie - 1] * portii;

        System.out.printf("Cost total: %.2f lei%n", costTotal);
    }
}