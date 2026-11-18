package Lab3;
import java.util.ArrayList;
import java.util.List;
public class Meniu {
    private String denumire;
    private List<Produs> produse;
    public Meniu(String denumire) {
        this.denumire = denumire;
        this.produse = new ArrayList<>();
    }
    public void adaugaProdus(Produs p) {
        if (!produse.contains(p)) {
            produse.add(p);
        }
    }
    public String getDenumire() {
        return denumire;
    }
    public List<Produs> getProduse() {
        return produse;
    }
    public void afiseazaMeniu() {
        System.out.println("--- " + denumire + " ---");
        for (Produs p : produse) {
            System.out.println("  * " + p.getDenumire() + " (Preț bază: " + p.getPretBaza() + " RON)");
        }
    }
}