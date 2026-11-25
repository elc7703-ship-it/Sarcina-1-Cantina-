package Lab4;
import Lab3.BauturaCalda;
import Lab3.Desert;
import Lab3.FelPrincipal;
import Lab3.GradPicant;
import Lab3.PortieDesert;
import Lab3.Produs;
import Lab3.TipLapte;
import java.util.List;
public class TestEtapa3Lab4 {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        Produs p1 = new FelPrincipal("Șnițel pui", 25.0, 4, GradPicant.NEPICANT, 250);
        Produs p2 = new Desert("Cheesecake", 18.0, 3, 420, PortieDesert.SIMPLA);
        Produs p3 = new BauturaCalda("Cappuccino", 12.0, 5, 250, TipLapte.NORMAL);
        catalog.adaugaProdus(p1);
        catalog.adaugaProdus(p2);
        catalog.adaugaProdus(p3);
        catalog.afiseaza();
        System.out.println("\nValoare totală stoc (BigDecimal): " + catalog.valoareStoc() + " MDL");
        List<Produs> deserturi = catalog.dinCategoria("Desert");
        System.out.println("\nProduse din categoria 'Desert':");
        for (Produs d : deserturi) {
            System.out.println("  * " + d.getDenumire() + " (" + d.pretFinal() + " MDL)");
        }
    }
}