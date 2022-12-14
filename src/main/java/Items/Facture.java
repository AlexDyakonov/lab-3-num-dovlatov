package Items;

import Interfaces.Adjectiveable;

public class Facture extends Item implements Adjectiveable {
    public Facture() {
        super("фактура");
    }

    @Override
    public String beAdjective() {
        return "фактурный";
    }
}
