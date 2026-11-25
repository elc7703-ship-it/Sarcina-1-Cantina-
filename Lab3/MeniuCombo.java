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
        recalculeazaPret();
    }
    private void recalculeazaPret() {
        double suma = 0;
        for (Produs p : componente) {
            suma += p.pretFinal();
        }
        double reducereProcent = 10 + (1 % 6); // 11%
        this.pretBaza = suma * (1 - reducereProcent / 100.0);
    }
    public boolean esteDisponibil() {
        for (Produs p : componente) {
            if (p.getStoc() <= 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public double pretFinal() {
        return pretBaza;
    }

    @Override
    public String toString() {
        return "MeniuCombo [ID=" + getId() + ", denumire=" + denumire + ", pretFinal=" + pretFinal() 
                + " MDL, disponibil=" + esteDisponibil() + "]";
    }
    @Override
public String categorie() {
    return "Meniu Combo";
}
}