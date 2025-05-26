package B15;

public class MasaRestaurant {
    private int numarMasa;
    private boolean ocupata = false;

    public MasaRestaurant(int numarMasa) {
        this.numarMasa = numarMasa;
    }

    public void setStatus(boolean status) {
        this.ocupata = status;
        System.out.println("Masa " + numarMasa + (status ? " a fost ocupata." : " a fost eliberata."));
    }

    public void showStatus() {
        System.out.println("Stare Masa " + numarMasa + ": " + (ocupata ? "OCUPATA" : "LIBERA"));
    }
}

