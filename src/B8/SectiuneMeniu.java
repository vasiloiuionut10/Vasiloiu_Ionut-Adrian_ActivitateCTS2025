package B8;

import java.util.ArrayList;
import java.util.List;

public class SectiuneMeniu implements ElementMeniu{
    private String denumireSectiune;
    List<ElementMeniu> listaItemuri;

    public SectiuneMeniu(String denumireSectiune) {
        this.denumireSectiune = denumireSectiune;
        listaItemuri = new ArrayList<>();
    }

    public void adaugaItem(ElementMeniu item) {
        this.listaItemuri.add(item);
    }

    public void stergeItem(ElementMeniu item) {
        this.listaItemuri.remove(item);
    }

    @Override
    public void afisazaInformatii(String indentare) {
        System.out.println(indentare + "=== " + denumireSectiune + " ===");
        for(ElementMeniu item : listaItemuri) {
            item.afisazaInformatii(indentare + " ");
        }
    }
}
