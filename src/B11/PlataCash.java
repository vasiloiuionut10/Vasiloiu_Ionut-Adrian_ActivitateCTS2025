package B11;

public class PlataCash implements ModPlata{
    private String sursaCash;

    public PlataCash(String sursaCash) {
        this.sursaCash = sursaCash;
    }

    @Override
    public void plateste(double suma) {
        System.out.println("Nota de " + suma + " RON a fost achitata folosind bani cash proveniti din " + sursaCash);
    }
}
