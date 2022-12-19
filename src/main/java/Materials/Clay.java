package Materials;

import Interfaces.Adjectiveable;

public class Clay extends Materials implements Adjectiveable {
    public Clay() {
        super("глина");
    }

    @Override
    public String beAdjective() {
        return "глиняняный";
    }
}
