import java.util.Scanner;
import java.util.Locale;

public class Lab2_B3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        double total = 0;

        System.out.println("Introdu maximum 5 comenzi (introdu 0 pentru a ieși mai devreme):");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Comanda " + i + " (1-zeamă, 2-piure, 3-salată, 4-compot, 0-stop): ");
            int optiune = scanner.nextInt();

            if (optiune == 0) {
                break; 
            }

            switch (optiune) {
                case 1: total += 24.50; break;
                case 2: total += 46.00; break;
                case 3: total += 18.00; break;
                case 4: total += 12.00; break;
                default:
                    System.out.println("Opțiune inexistentă!");
                    continue; 
            }
        }

        System.out.printf("\nTotal general fără reducere: %.2f lei\n", total);
        scanner.close();
    }
}