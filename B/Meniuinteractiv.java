package B;
import java.util.Locale;
import java.util.Scanner;
public class Meniuinteractiv {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double totalAcumulat = 0.0;
        System.out.println("MENIUL INTERACTIV");
        System.out.println("1. Zeamă de casă   - 24.50 lei");
        System.out.println("2. Piure cu pârjoală - 46.00 lei");
        System.out.println("3. Salată de varză - 18.00 lei");
        System.out.println("4. Compot          - 12.00 lei");
        System.out.println("0. Finalizare comandă");
        while (true) {
            System.out.print("Alegeți opțiunea (1-4 sau 0): ");
            int optiune = scanner.nextInt();
            if (optiune == 0) {
                break;
            } else if (optiune == 1) {
                totalAcumulat += 24.50;
            } else if (optiune == 2) {
                totalAcumulat += 46.00;
            } else if (optiune == 3) {
                totalAcumulat += 18.00;
            } else if (optiune == 4) {
                totalAcumulat += 12.00;
            } else {
                System.out.println("Opțiune invalidă!");
            }
        }
        System.out.printf("Total acumulat: %.2f lei\n", totalAcumulat);
        double sumaDePlata = totalAcumulat;
        if (totalAcumulat > 100.0) {
            double reducere = totalAcumulat * 0.15;
            sumaDePlata = totalAcumulat - reducere;
            System.out.printf("S-a aplicat reducerea de 15%%: %.2f lei\n", reducere);
        }
        System.out.printf("Suma de plată este: %.2f lei\n", sumaDePlata);
        scanner.close();
    }
}