package Lab3;
public class FelPrincipal extends Produs {
    private GradPicant gradPicant;
    private int gramaj;

    public FelPrincipal(String denumire, double pretBaza, int stoc, GradPicant gradPicant, int gramaj) {
        super(denumire, pretBaza, stoc);
        this.gradPicant = gradPicant;
        this.gramaj = gramaj;
    }

    @Override
    public double pretFinal() {
        return pretBaza;
    }

    @Override
    public String toString() {
        return super.toString().replace("]", "") + ", gradPicant=" + gradPicant + ", gramaj=" + gramaj + "g]";
    }
    @Override
public String categorie() {
    return "Fel Principal";
}
}