package Lab4;
import Lab3.BauturaCalda;
import Lab3.Desert;
import Lab3.FelPrincipal;
import Lab3.Produs;
import java.util.ArrayList;
import java.util.List;
public class TestEtapa2 {
    public static void main(String[] args) {
        FelPrincipal snitel = new FelPrincipal("Șnițel de pui", 28.0, 10);
        snitel.adaugaOptiunePersonalizare("extra lămâie");
        BauturaCalda cafea = new BauturaCalda("Latte", 14.0, 15);
        cafea.adaugaOptiunePersonalizare("sirop vanilie");
        Desert tiramisu = new Desert("Tiramisu", 18.0, 8);
        List<Produs> produse = new ArrayList<>();
        produse.add(snitel);
        produse.add(cafea);
        produse.add(tiramisu);
        for (Produs p : produse) {
            System.out.println("=== " + p.getDenumire() + " (" + p.categorie() + ") ===");

            if (p instanceof Personalizabil pers) {
                System.out.println("  - Capacitate Personalizabil: " + pers.rezumatPersonalizare());
            }
            if (p instanceof LaPachet ambalabil) {
                System.out.println("  - Capacitate LaPachet: " + ambalabil.tipAmbalaj()
                        + " (+" + ambalabil.costAmbalaj() + " MDL)");
            }
        }
    }
}