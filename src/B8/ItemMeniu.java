package B8;

public class ItemMeniu implements ElementMeniu{
    private String denumireItem;

    public ItemMeniu(String denumireItem) {
        this.denumireItem = denumireItem;
    }

    @Override
    public void afisazaInformatii(String indentare) {
        System.out.println("     -> " + denumireItem);
    }
}
