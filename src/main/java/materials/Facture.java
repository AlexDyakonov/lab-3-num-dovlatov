package materials;

import interfaces.Adjectiveable;

public class Facture extends Materials implements Adjectiveable {
    public Facture() {
        super("фактура");
    }

    @Override
    public String beAdjective() {
        return "фактурный";
    }
}
