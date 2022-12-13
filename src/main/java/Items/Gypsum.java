package Items;

import Interfaces.Adjectiveable;

public class Gypsum extends Item implements Adjectiveable {
    public Gypsum() {
        super("гипс");
    }

    @Override
    public String beAdjective() {
        return "гипсовый";
    }
}
