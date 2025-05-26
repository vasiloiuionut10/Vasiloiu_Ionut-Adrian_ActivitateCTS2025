package B15;

public class Operator {
    private ComandaSchimbaStatus comanda;

    public void preluareComanda(ComandaSchimbaStatus comanda) {
        this.comanda = comanda;
        System.out.println("Operator: Comada a fost preluata!");
    }

    public void trimiteComanda(){
        System.out.println("Operator: Comada se trimite...");
        if(comanda != null) {
            comanda.executa();
            comanda = null;
        } else {
            System.out.println("Operator: Nu sunt comenzi de trimis.");
        }
    }
}
