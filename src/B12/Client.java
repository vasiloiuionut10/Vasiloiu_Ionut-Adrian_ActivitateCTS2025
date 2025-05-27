package B12;

public class Client implements IClient{
    private String numeClient;

    public Client(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void primesteOferta(String oferta) {
        System.out.println(" -> Clientul Fidel " + this.numeClient + " a primit notificarea: " + oferta);
    }
}
