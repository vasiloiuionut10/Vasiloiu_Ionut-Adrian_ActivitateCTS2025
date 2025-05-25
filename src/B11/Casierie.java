package B11;

public class Casierie {
    // context pentru plata
    private ModPlata modPlata;

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void checkout(double suma){
        if(modPlata == null) {
            System.out.println("Va rog sa selectati o metoda de plata.");
            return;
        }
        modPlata.plateste(suma);
    }
}
