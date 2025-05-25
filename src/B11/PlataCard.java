package B11;

public class PlataCard implements ModPlata{
    private String numarCard;

    public PlataCard(String numarCard) {
        this.numarCard = numarCard;
    }

    @Override
    public void plateste(double suma) {
        System.out.println("Nota de " + suma + " RON a fost achitată folosind cardul al cărui număr se termină în " + numarCard);
    }
}
