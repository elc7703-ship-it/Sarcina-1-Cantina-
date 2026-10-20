import java.util.Locale;
public class Lab2_B2 {
    static final double TVA = 0.20;
    public static double calculeazaCost(double pret, int portii) {
        double baza = pret * portii;
        return baza + (baza * TVA);
    }
    public static double calculeazaCost(double pret, int portii, boolean bursier) {
        double baza = pret * portii;
        if (bursier) {
            baza = baza * 0.85; 
        }
        return baza + (baza * TVA);
    }
    public static class Produs {
        double pret;
        public Produs(double pret) {
            this.pret = pret;
        }
    }
    public static double calculeazaCost(Produs p, int portii) {
        double baza = p.pret * portii;
        return baza + (baza * TVA);
    }
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.printf("calculeazaCost(46.00, 2) = %.2f\n", calculeazaCost(46.00, 2));
        System.out.printf("calculeazaCost(46.00, 2, true) = %.2f\n", calculeazaCost(46.00, 2, true));
        Produs p = new Produs(46.00);
        System.out.printf("calculeazaCost(Produs, 2) = %.2f\n", calculeazaCost(p, 2));
    }
}