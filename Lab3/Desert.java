package Lab3;
public class Desert extends Produs {
    private int calorii;
    private PortieDesert portie;

    public Desert(String denumire, double pretBaza, int stoc, int calorii, PortieDesert portie) {
        super(denumire, pretBaza, stoc);
        this.calorii = calorii;
        this.portie = portie;
    }

    @Override
    public double pretFinal() {
        return (portie == PortieDesert.DUBLA) ? pretBaza * 1.5 : pretBaza;
    }

    @Override
    public String toString() {
        return super.toString().replace("]", "") + ", calorii=" + calorii + "kcal, portie=" + portie + "]";
    }
}