package Items;

import Interfaces.Adjectiveable;

public class Clay extends Item implements Adjectiveable {
    public Clay() {
        super("глина");
    }

    @Override
    public String beAdjective() {
        return "глиняняный";
    }
}
