package Lab3;
public class TestEtapa6 {
    public static void main(String[] args) {
        System.out.println("=== TESTARE ETAPA 6: Agregare Meniuri și Meniu Combo ===\n");
        try {
            BauturaCalda cafea = new BauturaCalda("Cafea Espresso", 10.0, 5, 150, TipLapte.NORMAL);
            Meniu meniuDimineata = new Meniu("Meniul Dimineții");
            Meniu meniuZilei = new Meniu("Meniul Zilei");
            meniuDimineata.adaugaProdus(cafea);
            meniuZilei.adaugaProdus(cafea);
            System.out.println("-> Afișare înainte de modificare:");
            meniuDimineata.afiseazaMeniu();
            meniuZilei.afiseazaMeniu();

            System.out.println("\n-> Modificăm prețul bazei cafelei la 12.5 RON...");
            meniuDimineata = null;
            System.gc(); // Garbage collection hint
            System.out.println("\n-> Meniul dimineții a fost setat la null.");
            System.out.println("Produsul 'cafea' încă există și poate fi accesat: " + cafea.getDenumire() + " cu stoc " + cafea.getStoc());
            System.out.println("\n--- Test Meniu Combo și Stoc Epuizat ---");
            FelPrincipal ciorba = new FelPrincipal("Ciorbă", 20.0, 0, GradPicant.NEPICANT, 300); // Stoc 0!
            MeniuCombo combo = new MeniuCombo("Combo Prânz", 10);
            combo.adaugaComponenta(ciorba);
            System.out.println(combo);
            if (!combo.esteDisponibil()) {
                System.out.println("❌ Combo-ul a fost refuzat deoarece o componentă are stocul epuizat!");
            }
        } catch (Exception e) {
            System.err.println("Eroare: " + e.getMessage());
        }
    }
}