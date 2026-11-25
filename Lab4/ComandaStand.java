package Lab4;
import Lab3.Produs;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ComandaStand {
    private final int numarComanda;
    private final boolean laPachet;
    private final List<Produs> articole = new ArrayList<>();
    public ComandaStand(int numarComanda, boolean laPachet) {
        this.numarComanda = numarComanda;
        this.laPachet = laPachet;
    }
    public void adaugaArticol(Produs produs) {
        if (produs == null) {
            throw new IllegalArgumentException("Produsul nu poate fi null.");
        }
        if (produs.getStoc() <= 0) {
            throw new IllegalStateException("Produsul '" + produs.getDenumire() + "' nu este pe stoc.");
        }
        produs.setStoc(produs.getStoc() - 1);
        articole.add(produs);
    }
    public List<Produs> getArticole() {
        return Collections.unmodifiableList(articole);
    }
    public BigDecimal calculeazaTotal() {
        BigDecimal total = BigDecimal.ZERO;
        for (Produs p : articole) {
            total = total.add(BigDecimal.valueOf(p.pretFinal()));
            if (laPachet && p instanceof LaPachet ambalabil) {
                total = total.add(BigDecimal.valueOf(ambalabil.costAmbalaj()));
            }
        }
        return total;
    }
    public void tiparesteBon() {
        System.out.println("=========================================");
        System.out.println("BON COMANDĂ #" + numarComanda + (laPachet ? " [LA PACHET]" : " [ÎN SALĂ]"));
        System.out.println("=========================================");
        for (Produs p : articole) {
            System.out.printf("- [%s] %s: %.2f MDL%n", p.categorie(), p.getDenumire(), p.pretFinal());
            if (p instanceof Personalizabil pers) {
                System.out.println("    -> " + pers.rezumatPersonalizare());
            }
            if (laPachet && p instanceof LaPachet ambalabil) {
                System.out.printf("    -> Ambalaj (%s): +%.2f MDL%n",
                        ambalabil.tipAmbalaj(), ambalabil.costAmbalaj());
            }
        }
        System.out.println("-----------------------------------------");
        System.out.println("TOTAL DE PLATĂ: " + calculeazaTotal() + " MDL");
        System.out.println("=========================================");
    }
}