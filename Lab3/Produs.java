package Lab3;
public abstract class Produs implements Comparable<Produs> {
    private static int contorId = 1;
    private final int id;
    protected String denumire;
    protected double pretBaza;
    protected int stoc;
    public Produs(String denumire, double pretBaza, int stoc) {
        if (denumire == null || denumire.isBlank()) {
            throw new IllegalArgumentException("Denumirea nu poate fi goală.");
        }
        if (pretBaza < 0) {
            throw new IllegalArgumentException("Prețul de bază nu poate fi negativ.");
        }
        if (stoc < 0) {
            throw new IllegalArgumentException("Stocul nu poate fi negativ.");
        }
        this.id = contorId++;
        this.denumire = denumire;
        this.pretBaza = pretBaza;
        this.stoc = stoc;
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
    public void setPretBaza(double pretBaza) {
        if (pretBaza < 0) {
            throw new IllegalArgumentException("Prețul de bază nu poate fi negativ.");
        }
        this.pretBaza = pretBaza;
    }
    public int getStoc() {
        return stoc;
    }
    public void setStoc(int stoc) {
        if (stoc < 0) {
            throw new IllegalArgumentException("Stocul nu poate fi negativ.");
        }
        this.stoc = stoc;
    }
    public abstract double pretFinal();
    public abstract String categorie();
    @Override
    public String toString() {
        return "[" + categorie() + "] ID=" + id
                + ", denumire=" + denumire
                + ", pretBaza=" + pretBaza + " MDL"
                + ", pretFinal=" + pretFinal() + " MDL"
                + ", stoc=" + stoc;
    }
    @Override
    public int compareTo(Produs altul) {
        if (altul == null) {
            throw new NullPointerException("Nu se poate compara cu null.");
        }
        int cmpPret = Double.compare(this.pretFinal(), altul.pretFinal());
        if (cmpPret != 0) {
            return cmpPret;
        }
        return this.denumire.compareToIgnoreCase(altul.denumire);
    }
}