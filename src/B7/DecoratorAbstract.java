package B7;

public class DecoratorAbstract implements INotaDePlata{
    protected INotaDePlata notaDecorata;

    public DecoratorAbstract(INotaDePlata nota) {
        this.notaDecorata = nota;
    }

    @Override
    public String getFelicitare() {
        return notaDecorata.getFelicitare();
    }
}
