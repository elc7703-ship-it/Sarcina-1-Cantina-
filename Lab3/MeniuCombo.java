package Lab3;
import java.util.ArrayList;
import java.util.List;

public class MeniuCombo extends Produs {
    private List<Produs> componente;

    public MeniuCombo(String denumire, int stoc) {
        super(denumire, 0.0, stoc);
        this.componente = new ArrayList<>();
    }

    public void adaugaComponenta(Produs p) {
        this.componente.add(p);
        recalculeazaPretSiDenumire();
    }

    private void recalculeazaPretSiDenumire() {
        double suma = 0;
        for (Produs p : componente) {
            suma += p.pretFinal();
        }
        this.pretBaza = suma * 0.89; // Reducere combo 11%
    }

    @Override
    public double pretFinal() {
        return pretBaza;
    }

    @Override
    public String toString() {
        return "MeniuCombo [ID=" + getId() + ", denumire=" + denumire + ", pretFinal=" + pretFinal() 
                + " RON, componente=" + componente.size() + "]";
    }
}