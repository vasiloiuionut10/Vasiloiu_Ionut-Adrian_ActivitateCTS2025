package B14;

public class MasaRestaurant {
    private int numarMasa;

    public void alegeMasalibera(int numarMasa){
        this.numarMasa = numarMasa;
        System.out.println("1. Masa " + numarMasa + " este libera si poate fi pregatita pentru urmatorii clienti.");
    }

    public void curatareMasa(){
        System.out.println("2. Masa " + numarMasa + " a fost curatata;");
    }

    public void asazaServetele(){
        System.out.println("3. Servetelele au fost aranjate pe masa " + numarMasa + ";");
    }

    public void asazaTacamuri(){
        System.out.println("4. Tacamurile au fost asezate pe masa " + numarMasa + ";" );
    }
}
