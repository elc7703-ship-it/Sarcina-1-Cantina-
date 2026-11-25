package Lab4;
import Lab3.Produs;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
public class Catalog {
    private final List<Produs> produse = new ArrayList<>();
    public void adaugaProdus(Produs produs) {
        if (produs == null) {
            throw new IllegalArgumentException("Produsul nu poate fi null.");
        }
        produse.add(produs);
    }
    public List<Produs> getProduse() {
        return Collections.unmodifiableList(produse);
    }
    public void afiseaza() {
        System.out.println("=== CATALOG PRODUSE ===");
        if (produse.isEmpty()) {
            System.out.println("Catalogul este gol.");
            return;
        }
        for (Produs p : produse) {
            System.out.printf("- [%s] %s | Preț bază: %.2f RON | Preț final: %.2f RON | Stoc: %d%n",
                    p.categorie(),
                    p.getDenumire(),
                    p.getPretBaza(),
                    p.pretFinal(),
                    p.getStoc());
        }
    }
    public BigDecimal valoareStoc() {
        BigDecimal total = BigDecimal.ZERO;
        for (Produs p : produse) {
            BigDecimal pretFinalBd = BigDecimal.valueOf(p.pretFinal());
            BigDecimal stocBd = BigDecimal.valueOf(p.getStoc());
            total = total.add(pretFinalBd.multiply(stocBd));
        }
        return total;
    }
    public List<Produs> dinCategoria(String categorie) {
        List<Produs> filtrate = new ArrayList<>();
        if (categorie == null || categorie.isBlank()) {
            return filtrate;
        }
        for (Produs p : produse) {
            if (categorie.equalsIgnoreCase(p.categorie())) {
                filtrate.add(p);
            }
        }
        return filtrate;
    }
    public List<Produs> sortateNatural() {
        List<Produs> copie = new ArrayList<>(produse);
        Collections.sort(copie);
        return copie;
    }
    public List<Produs> sortateDupaDenumire() {
        List<Produs> copie = new ArrayList<>(produse);
        copie.sort(Comparator.comparing(Produs::getDenumire, String.CASE_INSENSITIVE_ORDER)
                .thenComparingDouble(Produs::pretFinal));
        return copie;
    }
    public List<Produs> sortateDupaStocDescrescator() {
        List<Produs> copie = new ArrayList<>(produse);
        copie.sort(Comparator.comparingInt(Produs::getStoc).reversed()
                .thenComparing(Produs::getDenumire, String.CASE_INSENSITIVE_ORDER));
        return copie;
    }
    @Override
    public String toString() {
        return "Catalog{numarProduse=" + produse.size() + "}";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Catalog catalog)) return false;
        return Objects.equals(produse, catalog.produse);
    }
    @Override
    public int hashCode() {
        return Objects.hash(produse);
    }
}