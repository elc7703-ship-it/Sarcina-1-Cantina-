package A;
import java.util.Locale;
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
    @Override
    public String toString() {
        return "Produs: " + denumire + " | Preț: " + pret + " lei | Stoc: " + stoc;
    }
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Produs p1 = new Produs("Zeamă de casă", 24.50, 10);
        Produs p2 = new Produs("Piure cu pârjoală", 46.00, 15);
        Produs p3 = new Produs("Salată de varză", 18.00, 20);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}