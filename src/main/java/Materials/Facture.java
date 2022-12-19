package Materials;

import Interfaces.Adjectiveable;

public class Facture extends Materials implements Adjectiveable {
    public Facture() {
        super("фактура");
    }

    @Override
    public String beAdjective() {
        return "фактурный";
    }
}
