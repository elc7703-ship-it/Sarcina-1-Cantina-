package Lab4;
import Lab3.BauturaCalda;
import Lab3.Desert;
import Lab3.FelPrincipal;
import Lab3.GradPicant;
import Lab3.PortieDesert;
import Lab3.Produs;
import Lab3.TipLapte;
public class TestEtapa4Lab4 {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        catalog.adaugaProdus(new FelPrincipal("Șnițel pui", 25.0, 4, GradPicant.NEPICANT, 250));
        catalog.adaugaProdus(new Desert("Cheesecake", 18.0, 3, 420, PortieDesert.SIMPLA));
        catalog.adaugaProdus(new Desert("Brownie", 18.0, 7, 380, PortieDesert.SIMPLA));
        catalog.adaugaProdus(new BauturaCalda("Cappuccino", 12.0, 5, 250, TipLapte.NORMAL));
        System.out.println("=== 1. Ordine naturală (preț final crescător, apoi denumire) ===");
        for (Produs p : catalog.sortateNatural()) {
            System.out.printf("- %s: %.2f MDL (stoc: %d)%n", p.getDenumire(), p.pretFinal(), p.getStoc());
        }
        System.out.println("\n=== 2. Sortate alfabetic după denumire ===");
        for (Produs p : catalog.sortateDupaDenumire()) {
            System.out.printf("- %s: %.2f MDL (stoc: %d)%n", p.getDenumire(), p.pretFinal(), p.getStoc());
        }
        System.out.println("\n=== 3. Sortate descrescător după stoc ===");
        for (Produs p : catalog.sortateDupaStocDescrescator()) {
            System.out.printf("- %s: %.2f RON (stoc: %d)%n", p.getDenumire(), p.pretFinal(), p.getStoc());
        }
    }
}