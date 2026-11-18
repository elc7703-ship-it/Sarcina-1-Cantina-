package Lab3;
public class BauturaCalda extends Bautura {
    private TipLapte tipLapte;

    public BauturaCalda(String denumire, double pretBaza, int stoc, int volumMl, TipLapte tipLapte) {
        super(denumire, pretBaza, stoc, volumMl, false);
        this.tipLapte = tipLapte;
    }

    @Override
    public double pretFinal() {
        double supliment = (tipLapte != TipLapte.NORMAL) ? 2.0 : 0.0;
        return pretBaza + supliment;
    }

    @Override
    public String toString() {
        return "BauturaCalda [ID=" + getId() + ", denumire=" + denumire + ", pretBaza=" + pretBaza 
                + " RON, stoc=" + stoc + ", volum=" + volumMl + "ml, lapte=" + tipLapte + "]";
    }
}