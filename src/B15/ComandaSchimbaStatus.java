package B15;

public class ComandaSchimbaStatus implements Comanda{
    private MasaRestaurant masa;
    private boolean statusNou;

    public ComandaSchimbaStatus(MasaRestaurant masa, boolean statusNou) {
        this.masa = masa;
        this.statusNou = statusNou;
    }

    @Override
    public void executa() {
        System.out.println("Se executa comanda pentru shimbarea status in " + (statusNou ? "ocupata" : "libera") + "...");
        this.masa.setStatus(this.statusNou);
    }
}
