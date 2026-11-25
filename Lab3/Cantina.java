package Lab3;
import java.util.ArrayList;
import java.util.List;
public class Cantina {
    private String nume;
    private List<Produs> produse;

    public Cantina(String nume) {
        this.nume = nume;
        this.produse = new ArrayList<>();
    }
    public void adaugaProdus(Produs p) {
        if (!produse.contains(p)) {
            produse.add(p);
        }
    }
    public void plaseazaComanda(Produs p, int cantitateDorita) {
        if (!produse.contains(p)) {
            throw new IllegalArgumentException("Produsul nu se află în meniul cantinei!");
        }
        
        if (p.getStoc() < cantitateDorita) {
            throw new IllegalStateException("Comandă refuzată: Stoc insuficient pentru '" + p.getDenumire() + 
                                           "' (Stoc disponibil: " + p.getStoc() + ", Solicitat: " + cantitateDorita + ")");
        }
        p.setStoc(p.getStoc() - cantitateDorita);
        System.out.println("-> Comandă reușită: " + cantitateDorita + " x " + p.getDenumire() + " | Stoc rămas: " + p.getStoc());
    }
    public void afiseazaMeniu() {
        System.out.println("=== MENIUL CANTINEI: " + nume + " ===");
        if (produse.isEmpty()) {
            System.out.println("Cantina nu are produse în stoc momentan.");
            return;
        }
        for (Produs p : produse) {
            System.out.println("- " + p + " | Preț final: " + p.pretFinal() + " MDL");
        }
    }
    public double calculeazaValoareTotalaStoc() {
        double total = 0;
        for (Produs p : produse) {
            total += p.pretFinal() * p.getStoc();
        }
        return total;
    }
}