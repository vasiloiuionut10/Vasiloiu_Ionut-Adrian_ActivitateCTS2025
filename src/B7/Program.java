package B7;

public class Program {
    public static void main(String[] args) {
        INotaDePlata notaSimpla = new NotaDePlata();
        System.out.println(notaSimpla.getFelicitare());

        System.out.println();

        INotaDePlata notaCuFelicitare = new NotaCuFelicitare(notaSimpla);
        System.out.println(notaCuFelicitare.getFelicitare());

    }
}
