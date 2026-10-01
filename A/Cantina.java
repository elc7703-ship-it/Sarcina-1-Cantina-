package A;
import java.util.Locale;
import java.util.Scanner;
public class Cantina {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("MENIUL ZILEI");
        System.out.println("1. Zeamă de casă   - 24.50 lei");
        System.out.println("2. Piure cu pârjoală - 46.00 lei");
        System.out.println("3. Salată de varză - 18.00 lei");
        System.out.println("4. Compot          - 12.00 lei");
        System.out.println("--------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Alegeți produsul (1-4): ");
        int optiune = scanner.nextInt();
        System.out.print("Introduceți numărul de porții: ");
        int portii = scanner.nextInt();
        double pretUnitari = 0.0;
        if (optiune == 1) {
            pretUnitari = 24.50; // Zeamă de casă
        } else if (optiune == 2) {
            pretUnitari = 46.00; // Piure cu pârjoală
        } else if (optiune == 3) {
            pretUnitari = 18.00; // Salată de varză
        } else if (optiune == 4) {
            pretUnitari = 12.00; // Compot
        } else {
            System.out.println("Opțiune invalidă!");
            scanner.close();
            return;
        }
        double costTotal = portii * pretUnitari;
        System.out.println("Cost total: " + costTotal);
        scanner.close();
    }
}