package B15;

public class Program {
    public static void main(String[] args) {
        MasaRestaurant masa10 = new MasaRestaurant(10);
        Operator operator = new Operator();

        masa10.showStatus();

        System.out.println("\nOcuparea mesei 10:");
        ComandaSchimbaStatus cmso10 = new ComandaSchimbaStatus(masa10, true);
        operator.preluareComanda(cmso10);
        operator.trimiteComanda();
        masa10.showStatus();

        System.out.println("\nEliberarea mesei 10");
        ComandaSchimbaStatus cmse10 = new ComandaSchimbaStatus(masa10, false);
        operator.preluareComanda(cmse10);
        operator.trimiteComanda();
        masa10.showStatus();
    }
}
