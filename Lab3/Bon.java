package Lab3;
import java.util.ArrayList;
import java.util.List;
public class Bon {
    private static int contorBonuri = 1;
    private final int numarBon;
    private List<Produs> produseComandate;
    private double subtotal;
    private double reducere;
    private double total;
    private String cadou;
    public Bon(List<Produs> produseComandate) {
        this.numarBon = contorBonuri++;
        this.produseComandate = new ArrayList<>(produseComandate);
        calculeazaValori();
        verificaCadou();
    }
    private void calculeazaValori() {
        this.subtotal = 0;
        for (Produs p : produseComandate) {
            subtotal += p.pretFinal();
        }
        if (subtotal > 50.0) {
            this.reducere = subtotal * 0.10;
        } else {
            this.reducere = 0.0;
        }
        this.total = subtotal - reducere;
    }
    private void verificaCadou() {
        int n = 1; 
        int k = 3 + (n % 4);

        if (numarBon % k == 0) {
            this.cadou = "CADOU SPECIAL: O napolitană din partea casei!";
        } else {
            this.cadou = null;
        }
    }
    public void afiseazaBon() {
        System.out.println("========================================");
        System.out.println("              BON FISCAL #" + numarBon);
        System.out.println("========================================");
        for (Produs p : produseComandate) {
            System.out.println(" - " + p.getDenumire() + " ...... " + p.pretFinal() + " RON");
        }
        System.out.println("----------------------------------------");
        System.out.println("Subtotal: " + subtotal + " RON");
        if (reducere > 0) {
            System.out.println("Reducere (Regula Proprie - 10% over 50 RON): -" + reducere + " RON");
        }
        System.out.println("TOTAL DE PLATĂ: " + total + " RON");
        if (cadou != null) {
            System.out.println("----------------------------------------");
            System.out.println("🎁 " + cadou);
        }
        System.out.println("========================================\n");
    }
    public int getNumarBon() {
        return numarBon;
    }
}