package Lab3;
public class TestEtapa4 {
    public static void main(String[] args) {
        System.out.println("=== TESTARE ETAPA 4: Gestiune, Duplicate și Stocuri ===");
        try {
            Cantina cantinaFFI = new Cantina("Cantina Facultății");
            FelPrincipal ciorba = new FelPrincipal("Ciorbă de Burtă", 25.0, 15, GradPicant.MEDIU, 400);
            Desert prajitura = new Desert("Tiramisu", 18.0, 10, 450, PortieDesert.SIMPLA);
            cantinaFFI.adaugaProdus(ciorba);
            cantinaFFI.adaugaProdus(ciorba); // Aceeași ciorbă adăugată din nou
            cantinaFFI.adaugaProdus(prajitura);
            cantinaFFI.afiseazaMeniu();
            System.out.println("\n--- Test Comandă Validă ---");
            cantinaFFI.plaseazaComanda(ciorba, 5); // Scade stocul de la 15 la 10
            System.out.println("\n--- Test Comandă Refuzată (Stoc Insuficient) ---");
            try {
                cantinaFFI.plaseazaComanda(ciorba, 20); 
            } catch (Exception e) {
                System.err.println("Eroare prinsă corect: " + e.getMessage());
            }
            System.out.println("\nVerificare stoc după comanda refuzată (trebuie să fie tot 10): Stoc curent = " + ciorba.getStoc());

        } catch (Exception e) {
            System.err.println("Eroare generală: " + e.getMessage());
        }
    }
}