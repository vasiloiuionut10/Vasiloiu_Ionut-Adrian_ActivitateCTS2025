package B14;

import java.util.ArrayList;
import java.util.List;

public class OcupareMasa {
    private MasaRestaurant masa;
    private List<ClientRestaurant> clienti;

    public OcupareMasa(MasaRestaurant masa) {
        this.masa = masa;
        this.clienti = new ArrayList<>();
    }

    public void addClient(ClientRestaurant client) {
        clienti.add(client);
    }

    public void ocupaMasa(int idMasa){
        masa.alegeMasalibera(idMasa);
        masa.curatareMasa();
        masa.asazaServetele();
        masa.asazaTacamuri();
        for (ClientRestaurant client : clienti) {
            client.invitaClient();
        }
        System.out.println("Masa a fost ocupata.");
    }
}
