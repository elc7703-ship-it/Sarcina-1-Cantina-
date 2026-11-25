package Lab3;
import Lab4.LaPachet;
public class Desert extends Produs implements LaPachet {
    private int calorii;
    private PortieDesert portie;
    public Desert(String denumire, double pretBaza, int stoc, int calorii, PortieDesert portie) {
        super(denumire, pretBaza, stoc);
        this.calorii = calorii;
        this.portie = portie;
    }
    public Desert(String denumire, double pretBaza, int stoc) {
        this(denumire, pretBaza, stoc, 350, PortieDesert.SIMPLA);
    }
    @Override
    public double pretFinal() {
        return pretBaza;
    }
    @Override
    public String tipAmbalaj() {
        return "Cutie patiserie";
    }
    @Override
    public double costAmbalaj() {
        return 1.5;
    }
    @Override
    public String categorie() {
        return "Desert";
    }
}