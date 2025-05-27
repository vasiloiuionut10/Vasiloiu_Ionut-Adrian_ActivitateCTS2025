package B13;

public class StareLibera implements IStareMasa {
    private Masa masa;

    public StareLibera(Masa context) {
        this.masa = context;
    }

    @Override
    public void rezerva() {
        System.out.println("Masa " + masa.numarMasa + " este libera: Se poate rezerva.");
        masa.schimbaStarea(new StareRezervata(this.masa));
    }

    @Override
    public void ocupa() {
        System.out.println("Masa " + masa.numarMasa + " este libera: Se poate ocupa direct.");
        masa.schimbaStarea(new StareOcupata(this.masa));
    }

    @Override
    public void elibereaza() {
        System.out.println("Masa " + masa.numarMasa + " este deja libera.");
    }
}