package B12;

public interface IOfertaRestaurant {
    void aboneazaClient(IClient client);
    void dezaboneazaClient(IClient client);
    void notificareClient(String oferta);
}
