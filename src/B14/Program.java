package B14;

public class Program {
    public static void main(String[] args) {
        ClientRestaurant client1 = new ClientRestaurant("client1");
        ClientRestaurant client2 = new ClientRestaurant("client2");
        MasaRestaurant masa1 = new MasaRestaurant();
        OcupareMasa ocupareMasa = new OcupareMasa(masa1);
        ocupareMasa.addClient(client1);
        ocupareMasa.addClient(client2);

        ocupareMasa.ocupaMasa(10);
    }

}
