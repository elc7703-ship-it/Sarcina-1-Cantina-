package Lab3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Lab4.Personalizabil;
public class BauturaCalda extends Bautura implements Personalizabil {
    private TipLapte tipLapte;
    private final List<String> optiuniPersonalizare = new ArrayList<>();

    public BauturaCalda(String denumire, double pretBaza, int stoc, int volumMl, TipLapte tipLapte) {
        super(denumire, pretBaza, stoc, volumMl, false);
        this.tipLapte = tipLapte;
    }
    public BauturaCalda(String denumire, double pretBaza, int stoc) {
        this(denumire, pretBaza, stoc, 250, TipLapte.NORMAL);
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
    public String categorie() {
        return "Băutură Caldă";
    }
}