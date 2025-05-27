package B13;

public class StareOcupata implements IStareMasa {
    private Masa masa;

    public StareOcupata(Masa context) {
        this.masa = context;
    }

    @Override
    public void rezerva() {
        System.out.println("Masa " + masa.numarMasa + " este ocupata. Nu se poate rezerva acum.");
    }

    @Override
    public void ocupa() {
        System.out.println("Masa " + masa.numarMasa + " este deja ocupata.");
    }

    @Override
    public void elibereaza() { // Clientul pleaca
        System.out.println("Clientul a plecat. Masa " + masa.numarMasa + " s-a eliberat.");
        masa.schimbaStarea(new StareLibera(this.masa));
    }
}