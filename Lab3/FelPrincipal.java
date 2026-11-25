package Lab3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Lab4.LaPachet;
import Lab4.Personalizabil;
public class FelPrincipal extends Produs implements Personalizabil, LaPachet {
    private GradPicant gradPicant;
    private int gramaj;
    private final List<String> optiuniPersonalizare = new ArrayList<>();

    public FelPrincipal(String denumire, double pretBaza, int stoc, GradPicant gradPicant, int gramaj) {
        super(denumire, pretBaza, stoc);
        this.gradPicant = gradPicant;
        this.gramaj = gramaj;
    }
    public FelPrincipal(String denumire, double pretBaza, int stoc) {
        this(denumire, pretBaza, stoc, GradPicant.NEPICANT, 300);
    }

    @Override
    public double pretFinal() {
        return pretBaza;
    }

    @Override
    public void adaugaOptiunePersonalizare(String optiune) {
        if (optiune != null && !optiune.isBlank()) {
            optiuniPersonalizare.add(optiune.trim());
        }
    }
    @Override
    public List<String> getOptiuniPersonalizare() {
        return Collections.unmodifiableList(optiuniPersonalizare);
    }
    @Override
    public String tipAmbalaj() {
        return "Caserolă termică";
    }
    @Override
    public double costAmbalaj() {
        return 2.5;
    }
    @Override
    public String categorie() {
        return "Fel Principal";
    }
}