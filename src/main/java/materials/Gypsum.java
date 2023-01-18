package materials;

import interfaces.Adjectiveable;

public class Gypsum extends Materials implements Adjectiveable {
    public Gypsum() {
        super("гипс");
    }

    @Override
    public String beAdjective() {
        return "гипсовый";
    }
}
