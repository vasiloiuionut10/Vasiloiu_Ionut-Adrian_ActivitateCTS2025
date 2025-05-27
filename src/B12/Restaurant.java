package B12;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IOfertaRestaurant{
    private String numeRestaurant;
    private List<IClient> listaClienti;

    public Restaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
        this.listaClienti = new ArrayList<>();
    }

    @Override
    public void notificareClient(String oferta) {
        System.out.println("Restaurantul " + numeRestaurant + " trimite notificari catre " + listaClienti.size() + " clienti fideli:");
        for(IClient client : listaClienti) {
            client.primesteOferta(oferta);
        }
    }

    public void lanseazaOferta(String oferta) {
        System.out.println("Restaurantul " + numeRestaurant + " laseaza oferta noua: ");
        notificareClient(oferta);
    }

    @Override
    public void aboneazaClient(IClient client) {
        this.listaClienti.add(client);
        System.out.println("Un client s-a abonat la ofertele restaurantului " + numeRestaurant);
    }

    @Override
    public void dezaboneazaClient(IClient client) {
        this.listaClienti.remove(client);
        System.out.println("Un client s-a dezabonat la ofertele restaurantului + " + numeRestaurant);
    }

}
