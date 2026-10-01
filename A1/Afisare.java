import java.util.Locale;

public class Afisare {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Produs p1 = new Produs("Zeama de casa", 24.50, 10);
        Produs p2 = new Produs("Piure cu parjoala", 46.00, 8);
        Produs p3 = new Produs("Salata de varza", 18.00, 15);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
} 