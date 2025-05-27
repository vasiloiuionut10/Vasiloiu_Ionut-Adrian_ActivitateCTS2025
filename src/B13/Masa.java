package B13;

public class Masa {
    private IStareMasa stare;
    public final int numarMasa;

    public Masa(int numarMasa) {
        this.numarMasa = numarMasa;
        this.stare = new StareLibera(this);
        System.out.println("Masa cu numarul " + numarMasa + " a fost creata cu stare initiala -> Libera.");
    }

    // Metoda prin care starile schimba starea Contextului
    public void schimbaStarea(IStareMasa nouaStare) {
        this.stare = nouaStare;
        System.out.println("Starea mesei " + numarMasa + " s-a schimbat in -> " +
                nouaStare.getClass().getSimpleName());
    }

    public void solicitaRezervare() {
        System.out.println("Masa cu numarul" + numarMasa + " a primit solicitare de REZERVARE.");
        stare.rezerva();
    }

    public void solicitaOcupare() {
        System.out.println("Masa cu numarul" + numarMasa + " a primit solicitare de OCUPARE.");
        stare.ocupa();
    }

    public void solicitaEliberare() {
        System.out.println("Masa cu numarul " + numarMasa + " a primit solicitare de ELIBERARE.");
        stare.elibereaza();
    }

    public String getStare() {
        return this.stare.getClass().getSimpleName();
    }
}
