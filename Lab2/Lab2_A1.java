import java.util.Scanner;
import java.util.Locale;
public class Lab2_A1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        int optiune;
        do {
            System.out.println("\n--- MENIUL ZILEI ---");
            System.out.println("1 - Zeamă de casă (24.50 lei)");
            System.out.println("2 - Piure cu pârjoală (46.00 lei)");
            System.out.println("3 - Salată de varză (18.00 lei)");
            System.out.println("4 - Compot (12.00 lei)");
            System.out.println("0 - Finalizarea comenzii");
            System.out.print("Alege o opțiune: ");
            optiune = scanner.nextInt();
            switch (optiune) {
                case 1:
                    total += 24.50;
                    break;
                case 2:
                    total += 46.00;
                    break;
                case 3:
                    total += 18.00;
                    break;
                case 4:
                    total += 12.00;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opțiune inexistentă.");
                    break;
            }
        } while (optiune != 0);
        double dePlata = total > 100.0 ? total * 0.85 : total;
        System.out.println("\n--- REZULTAT ---");
        System.out.printf("Total: %.2f lei\n", total);
        System.out.printf("Suma de plată: %.2f lei\n", dePlata);
        scanner.close();
    }
}