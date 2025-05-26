package B14;

public class ClientRestaurant {
    private String idClient;

    public ClientRestaurant(String idClient) {
        this.idClient = idClient;
    }

    public void invitaClient() {
        System.out.println("Clientul " + this.idClient + " a fost invitat la masa;" );
    }
}
