package B13;

public class Program {
    public static void main(String[] args) {
        Masa masa10 = new Masa(10);
        System.out.println("Starea initiala a mesei 10: " + masa10.getStare());

        System.out.println();

        // Liber -> Ocupat
        masa10.solicitaOcupare();

        System.out.println();

        // Ocupat -> Rezervat
        masa10.solicitaRezervare();

        System.out.println();

        // Ocupat -> Liber
        masa10.solicitaEliberare();

        System.out.println();

        // Liber -> Rezervat
        masa10.solicitaRezervare();

        System.out.println();

        // Rezervat -> Oupat
        masa10.solicitaOcupare();
    }
}
