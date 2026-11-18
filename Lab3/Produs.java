package Lab3;
import java.util.Objects;
public class Produs {
    private static int contorId = 1;
    private final int id;
    protected String denumire;
    protected double pretBaza;
    protected int stoc;
    public Produs(String denumire, double pretBaza, int stoc) {
        valideazaDate(denumire, pretBaza, stoc);
        this.id = contorId++;
        this.denumire = denumire;
        this.pretBaza = pretBaza;
        this.stoc = stoc;
    }
    public Produs(String denumire, double pretBaza) {
        this(denumire, pretBaza, 0); 
    }
    private void valideazaDate(String denumire, double pretBaza, int stoc) {
        if (denumire == null || denumire.trim().isEmpty()) {
            throw new IllegalArgumentException("Denumirea produsului nu poate fi nulă sau vidă!");
        }
        if (pretBaza < 0) {
            throw new IllegalArgumentException("Prețul de bază nu poate fi negativ!");
        }
        if (stoc < 0) {
            throw new IllegalArgumentException("Stocul nu poate fi negativ!");
        }
    }
    public int getId() {
        return id;
    }

    public String getDenumire() {
        return denumire;
    }

    public double getPretBaza() {
        return pretBaza;
    }

    public int getStoc() {
        return stoc;
    }

    public void setStoc(int stoc) {
        if (stoc < 0) {
            throw new IllegalArgumentException("Stocul nou nu poate fi negativ!");
        }
        this.stoc = stoc;
    }

    public double pretFinal() {
        return pretBaza;
    }

    @Override
    public String toString() {
        return "Produs [ID=" + id + ", denumire=" + denumire + ", pretBaza=" + pretBaza + " RON, stoc=" + stoc + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produs produs = (Produs) o;
        return id == produs.id || denumire.equalsIgnoreCase(produs.denumire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, denumire);
    }

    public static void main(String[] args) {
        System.out.println("=== TESTARE ETAPA 2: Superclasa Produs ===");
        
        try {
            // Test 1: Crearea unor produse valide (verificare ID-uri automate: 1, 2, 3)
            Produs p1 = new Produs("Paste Carbonara", 45.0, 10);
            Produs p2 = new Produs("Burger Vită", 55.0, 5);
            Produs p3 = new Produs("Limonadă", 18.0); // Stoc implicit 0

            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);

            // Test 2: Verificare excepție pentru preț negativ (cerința de verificare din lab)
            System.out.println("\nSe testează validarea pentru preț negativ:");
            Produs pEroare = new Produs("Produs Invalid", -5.0, 10);
            
        } catch (IllegalArgumentException e) {
            System.err.println("EXCEPȚIE CAPTURATĂ CORECT: " + e.getMessage());
        }

        try {
            // Test 3: Verificare excepție pentru denumire vidă
            System.out.println("\nSe testează validarea pentru denumire vidă:");
            Produs pEroare2 = new Produs("", 20.0, 5);
            
        } catch (IllegalArgumentException e) {
            System.err.println("EXCEPȚIE CAPTURATĂ CORECT: " + e.getMessage());
        }
    }
}