package Lab3;
public class TestEtapa3 {
    public static void main(String[] args) {
        System.out.println("=== TESTARE ETAPA 3: Subclase și Enum-uri ===");

        try {
            FelPrincipal ciorba = new FelPrincipal("Ciorbă de Burtă", 25.0, 15, GradPicant.MEDIU, 400);
            System.out.println(ciorba);

            Desert prajitura = new Desert("Tiramisu", 18.0, 10, 450, PortieDesert.SIMPLA);
            System.out.println(prajitura);

            BauturaCalda cafea = new BauturaCalda("Latte Macchiato", 12.0, 20, 250, TipLapte.OVAZ);
            System.out.println(cafea + " | Preț final: " + cafea.pretFinal() + " MDL");

            MeniuCombo comboPranz = new MeniuCombo("Combo Prânz", 5);
            comboPranz.adaugaComponenta(ciorba);
            comboPranz.adaugaComponenta(prajitura);
            comboPranz.adaugaComponenta(cafea);

            System.out.println(comboPranz);

        } catch (Exception e) {
            System.err.println("Eroare: " + e.getMessage());
        }
    }
}