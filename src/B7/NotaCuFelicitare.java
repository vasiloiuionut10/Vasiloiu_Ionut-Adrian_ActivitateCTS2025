package B7;

public class NotaCuFelicitare extends DecoratorAbstract {
    private final String felicitare = "\n**** La Mulți Ani! *****";

    public NotaCuFelicitare(INotaDePlata nota) {
        super(nota);
        System.out.println("A fost adaugata Felicitarea suplimentara: ");
    }

    @Override
    public String getFelicitare() {
        return super.getFelicitare() + "\n*****    La Multi Ani!    *****";
    }
}
