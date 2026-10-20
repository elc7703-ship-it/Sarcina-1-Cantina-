import java.util.Scanner;
import java.util.Locale;
public class Lab2_A3 {
    public static double pretProdus(int optiune) {
        switch (optiune) {
            case 1: return 24.50;
            case 2: return 46.00;
            case 3: return 18.00;
            case 4: return 12.00;
            default: return 0.0;
        }
    }
    public static void afiseazaTabelCosturi(double pret) {
        System.out.print("Costuri pentru 1-5 porții: ");
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%.2f ", pret * i);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- MENIUL ZILEI ---");
        System.out.println("1 - Zeamă de casă (24.50 lei)");
        System.out.println("2 - Piure cu pârjoală (46.00 lei)");
        System.out.println("3 - Salată de varză (18.00 lei)");
        System.out.println("4 - Compot (12.00 lei)");
        System.out.print("Alege opțiunea pentru a vedea tabelul de porții: ");
        int optiune = scanner.nextInt();
        double pretAles = pretProdus(optiune);
        if (pretAles > 0) {
            System.out.printf("Ai ales produsul cu prețul de bază: %.2f lei\n", pretAles);
            afiseazaTabelCosturi(pretAles);
        } else {
            System.out.println("Opțiune inexistentă!");
        }
        scanner.close();
    }
}