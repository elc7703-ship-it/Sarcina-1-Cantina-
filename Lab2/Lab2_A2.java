import java.util.Scanner;
import java.util.Locale;
public class Lab2_A2 {
    public static void afiseazaMeniu() {
        System.out.println("\n--- MENIUL ZILEI ---");
        System.out.println("1 - Zeamă de casă (24.50 lei)");
        System.out.println("2 - Piure cu pârjoală (46.00 lei)");
        System.out.println("3 - Salată de varză (18.00 lei)");
        System.out.println("4 - Compot (12.00 lei)");
        System.out.println("0 - Finalizarea comenzii");
        System.out.print("Alege o opțiune: ");
    }
    public static double pretProdus(int optiune) {
        switch (optiune) {
            case 1: return 24.50;
            case 2: return 46.00;
            case 3: return 18.00;
            case 4: return 12.00;
            default: return 0.0;
        }
    }
    public static double aplicaReducere(double total) {
        if (total > 100.0) {
            return total * 0.85;
        }
        return total;
    }
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        int optiune;
        do {
            afiseazaMeniu();
            optiune = scanner.nextInt();
            if (optiune >= 1 && optiune <= 4) {
                total += pretProdus(optiune);
            } else if (optiune != 0) {
                System.out.println("Opțiune inexistentă.");
            }
        } while (optiune != 0);
        double dePlata = aplicaReducere(total);
        System.out.println("\n--- REZULTAT ---");
        System.out.printf("Total: %.2f lei\n", total);
        System.out.printf("Suma de plată: %.2f lei\n", dePlata);
        scanner.close();
    }
}