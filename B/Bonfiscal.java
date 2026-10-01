package B;
import java.util.Locale;
import java.util.Scanner;
public class Bonfiscal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENIUL ZILEI ");
       System.out.println("1. Zeamă de casă   - 24.50 lei");
        System.out.println("2. Piure cu pârjoală - 46.00 lei");
        System.out.println("3. Salată de varză - 18.00 lei");
        System.out.println("4. Compot          - 12.00 lei");
        System.out.print("Alegeți produsul (1-4): ");
        int optiune = scanner.nextInt();
        System.out.print("Introduceți numărul de porții: ");
        int portii = scanner.nextInt();
        System.out.print("Sunteți student bursier? (Da/Nu): ");
        String raspunsBursier = scanner.next();
        boolean esteBursier = raspunsBursier.equalsIgnoreCase("da");
        double pretUnitar = 0.0;
        if (optiune == 1) pretUnitar = 24.50;
        else if (optiune == 2) pretUnitar = 46.00;
        else if (optiune == 3) pretUnitar = 18.00;
        else if (optiune == 4) pretUnitar = 12.00;
        double subtotal = pretUnitar * portii;
        double reducere = 0.0;
        if (esteBursier) {
            reducere = subtotal * 0.15;
        }
        double bazaTva = subtotal - reducere;
        double tva = bazaTva * 0.20;
        double total = bazaTva + tva;
        System.out.printf("subtotal %.2f; reducere %.2f; TVA %.2f; total %.2f lei\n", subtotal, reducere, tva, total);
        scanner.close();
    }
}