package B11;

public class Program {
    public static void main(String[] args) {
        Casierie casierie = new Casierie();
        double sumaDeAchitat = 958.5;

        // Mod de plata neselectat
        casierie.checkout(sumaDeAchitat);
        System.out.println();

        // Mod de plata cu cardul
        casierie.setModPlata(new PlataCard("4586"));
        casierie.checkout(sumaDeAchitat);
        System.out.println();

        // Mod de plata cash
        casierie.setModPlata(new PlataCash("salariu"));
        casierie.checkout(sumaDeAchitat);
    }
}
