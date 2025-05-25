package B8;

public class Program {
    public static void main(String[] args) {
        ElementMeniu apaPlata = new ItemMeniu("Apa plata");
        ElementMeniu apaMinerala = new ItemMeniu("Apa minerala");
        ElementMeniu pepsi = new ItemMeniu("Pepsi");
        ElementMeniu mirinda = new ItemMeniu("Mirinda");
        ElementMeniu cocaCola = new ItemMeniu("Coca-Cola");
        ElementMeniu cafeaAmericano = new ItemMeniu("Cafea Americano");
        ElementMeniu cappuccino = new ItemMeniu("Cappuccino");
        ElementMeniu latte = new ItemMeniu("Latte");
        ElementMeniu vin = new ItemMeniu("Vin");
        ElementMeniu vodca = new ItemMeniu("Vodca");
        ElementMeniu biter = new ItemMeniu("Biter");

        SectiuneMeniu meniuBauturi = new SectiuneMeniu("Meniu bauturi");
        SectiuneMeniu bauturiAlcoolice = new SectiuneMeniu("Bauturi alcoolice");
        SectiuneMeniu bauturiNonAlcoolice = new SectiuneMeniu("Bauturi non-alcoolice");
        SectiuneMeniu sucuri = new SectiuneMeniu("Sucuri");
        SectiuneMeniu cafea = new SectiuneMeniu("Cafea");
        SectiuneMeniu apa = new SectiuneMeniu("Apa");

        apa.adaugaItem(apaPlata);
        apa.adaugaItem(apaMinerala);
        sucuri.adaugaItem(pepsi);
        sucuri.adaugaItem(mirinda);
        sucuri.adaugaItem(cocaCola);
        cafea.adaugaItem(cafeaAmericano);
        cafea.adaugaItem(cappuccino);
        cafea.adaugaItem(latte);
        bauturiAlcoolice.adaugaItem(vin);
        bauturiAlcoolice.adaugaItem(vodca);
        bauturiAlcoolice.adaugaItem(biter);

        bauturiNonAlcoolice.adaugaItem(apa);
        bauturiNonAlcoolice.adaugaItem(cafea);
        bauturiNonAlcoolice.adaugaItem(sucuri);

        meniuBauturi.adaugaItem(bauturiNonAlcoolice);
        meniuBauturi.adaugaItem(bauturiAlcoolice);

        meniuBauturi.afisazaInformatii("  ");
    }
}
