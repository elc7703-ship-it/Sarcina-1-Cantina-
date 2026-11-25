package Lab4;

import java.util.List;

public interface Personalizabil {
    void adaugaOptiunePersonalizare(String optiune);

    List<String> getOptiuniPersonalizare();

    default String rezumatPersonalizare() {
        List<String> optiuni = getOptiuniPersonalizare();
        if (optiuni == null || optiuni.isEmpty()) {
            return "fără personalizări suplimentare";
        }
        return "personalizări: " + String.join(", ", optiuni);
    }
}