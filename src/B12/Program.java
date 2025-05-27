package B12;

public class Program {
    public static void main(String[] args) {
        // obiectul restaurant care trimite oferte
        Restaurant restaurant1 = new Restaurant("Restaurant1");

        // obiectele care vor observa
        IClient client1 = new Client("Client1");
        IClient client2 = new Client("Client2");
        IClient client3 = new Client("Client3");

        System.out.println("Abonare clienti la oferte:");
        restaurant1.aboneazaClient(client1);
        restaurant1.aboneazaClient(client2);
        System.out.println();

        // lansare oferta
        restaurant1.lanseazaOferta("Meniul zilei la doar 30RON!");
        System.out.println();

        // adaug in ca un client in lista de abonati
        restaurant1.aboneazaClient(client3);
        restaurant1.lanseazaOferta("Happy Hour la bauturi intre 17-19!");
        System.out.println();

        // un client se dezaboneaza
        restaurant1.dezaboneazaClient(client3);
        restaurant1.lanseazaOferta("Vinerea desertul este GRATIS!");
    }
}
