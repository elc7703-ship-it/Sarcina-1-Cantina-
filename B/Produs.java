package B;
import java.util.Locale;
import java.util.Scanner;
public class Produs {
    private String denumire;
    private double pret;
    private int stoc;
    public Produs(String denumire, double pret, int stoc) {
        this.denumire = denumire;
        this.pret = pret;
        this.stoc = stoc;
    }
    public String getDenumire() {
        return denumire;
    }
    public double getPret() {
        return pret;
    }
    public int getStoc() {
        return stoc;
    }
    public double costPentru(int portii) {
        return pret * portii;
    }
    public boolean esteDisponibil(int portii) {
        return stoc >= portii;
    }
    @Override
    public String toString() {
        return "Produs: " + denumire + " | Preț: " + pret + " lei | Stoc: " + stoc;
    }
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Produs p1 = new Produs("Zeamă de casă", 24.50, 10);
        Produs p2 = new Produs("Piure cu pârjoală", 46.00, 15);
        Produs p3 = new Produs("Salată de varză", 18.00, 20);
        Produs p4 = new Produs("Compot", 12.00, 5);
        System.out.print("Introduceți denumirea produsului dorit: ");
        String denumireCautata = scanner.nextLine();
        Produs produsGasit = null;
        if (p1.getDenumire().equalsIgnoreCase(denumireCautata)) {
            produsGasit = p1;
        } else if (p2.getDenumire().equalsIgnoreCase(denumireCautata)) {
            produsGasit = p2;
        } else if (p3.getDenumire().equalsIgnoreCase(denumireCautata)) {
            produsGasit = p3;
        } else if (p4.getDenumire().equalsIgnoreCase(denumireCautata)) {
            produsGasit = p4;
        }
        if (produsGasit == null) {
            System.out.println("Produsul solicitat nu există în meniu!");
        } else {
            System.out.print("Introduceți numărul de porții dorite: ");
            int portii = scanner.nextInt();
            if (produsGasit.esteDisponibil(portii)) {
                System.out.println("Produsul este disponibil!");
                System.out.println("Costul total: " + produsGasit.costPentru(portii) + " lei");
            } else {
                System.out.println("Stoc insuficient! Stoc disponibil: " + produsGasit.getStoc());
            }
        }
        scanner.close();
    }
}