package Lab3;
import java.util.ArrayList;
import java.util.List;
public class TestEtapa5 {
    public static void main(String[] args) {
        System.out.println("=== TESTARE ETAPA 5: Bonul și Regula Proprie ===\n");
        try {
            FelPrincipal ciorba = new FelPrincipal("Ciorbă de Burtă", 25.0, 10, GradPicant.MEDIU, 400);
            Desert prajitura = new Desert("Tiramisu", 18.0, 10, 450, PortieDesert.SIMPLA);
            BauturaCalda cafea = new BauturaCalda("Latte Macchiato", 12.0, 10, 250, TipLapte.OVAZ);
            List<Produs> lista1 = new ArrayList<>();
            lista1.add(ciorba);
            lista1.add(prajitura); 
            List<Produs> lista2 = new ArrayList<>();
            lista2.add(ciorba);
            lista2.add(prajitura);
            lista2.add(cafea); 
            Bon bon1 = new Bon(lista1);
            bon1.afiseazaBon();
            Bon bon2 = new Bon(lista1);
            bon2.afiseazaBon();
            Bon bon3 = new Bon(lista2);
            bon3.afiseazaBon();
            Bon bon4 = new Bon(lista1);
            bon4.afiseazaBon();
        } catch (Exception e) {
            System.err.println("Eroare: " + e.getMessage());
        }
    }
}