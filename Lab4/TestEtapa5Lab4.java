package Lab4;
import Lab3.BauturaCalda;
import Lab3.Desert;
import Lab3.FelPrincipal;
import Lab3.GradPicant;
import Lab3.PortieDesert;
import Lab3.Produs;
import Lab3.TipLapte;
public class TestEtapa5Lab4 {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        FelPrincipal snitel = new FelPrincipal("Șnițel de pui", 25.0, 4, GradPicant.NEPICANT, 250);
        snitel.adaugaOptiunePersonalizare("extra lămâie");
        Desert tiramisu = new Desert("Tiramisu", 18.0, 3, 420, PortieDesert.SIMPLA);
        BauturaCalda latte = new BauturaCalda("Caffe Latte", 12.0, 5, 250, TipLapte.NORMAL);
        latte.adaugaOptiunePersonalizare("sirop vanilie");
        catalog.adaugaProdus(snitel);
        catalog.adaugaProdus(tiramisu);
        catalog.adaugaProdus(latte);
        System.out.println(">>> Stoc inițial catalog:");
        catalog.afiseaza();
        System.out.println("Valoare stoc inițial: " + catalog.valoareStoc() + " MDL\n");
        ComandaStand comanda = new ComandaStand(101, true);
        comanda.adaugaArticol(snitel);
        comanda.adaugaArticol(tiramisu);
        comanda.adaugaArticol(latte);
        comanda.tiparesteBon();
        System.out.println("\n>>> Stoc actualizat după comandă (sortat descrescător după stoc):");
        for (Produs p : catalog.sortateDupaStocDescrescator()) {
            System.out.printf("- %s: stoc rămas = %d%n", p.getDenumire(), p.getStoc());
        }
        System.out.println("Valoare stoc rămas: " + catalog.valoareStoc() + " MDL");
    }
}