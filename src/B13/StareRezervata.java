package B13;

public class StareRezervata implements IStareMasa {
    private Masa masa;

    public StareRezervata(Masa context) {
        this.masa = context;
    }

    @Override
    public void rezerva() {
        System.out.println("Masa " + masa.numarMasa + " este deja rezervata.");
    }

    @Override
    public void ocupa() { // Clientul "ridica" rezervarea
        System.out.println("Rezervarea este onorata. Masa " + masa.numarMasa + " s-a ocupat.");
        masa.schimbaStarea(new StareOcupata(this.masa));
    }

    @Override
    public void elibereaza() { // Anulare rezervare
        System.out.println("Rezervarea este anulata. Masa" + masa.numarMasa + "s-a eliberat.");
        masa.schimbaStarea(new StareLibera(this.masa));
    }
}