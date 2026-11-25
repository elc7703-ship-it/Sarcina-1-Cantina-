package Lab3;
public class Bautura extends Produs {
    protected int volumMl;
    protected boolean cuGheata;

    public Bautura(String denumire, double pretBaza, int stoc, int volumMl, boolean cuGheata) {
        super(denumire, pretBaza, stoc);
        this.volumMl = volumMl;
        this.cuGheata = cuGheata;
    }

    @Override
    public double pretFinal() {
        return pretBaza;
    }

    @Override
    public String toString() {
        return super.toString().replace("]", "") + ", volum=" + volumMl + "ml, cuGheata=" + cuGheata + "]";
    }
    @Override
public String categorie() {
    return "Băutură";
}
}