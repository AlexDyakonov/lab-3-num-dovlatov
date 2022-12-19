package Materials;

import Interfaces.Adjectiveable;

public class Wood extends Materials implements Adjectiveable {
    public Wood() {
        super("дерево");
    }

    @Override
    public String beAdjective() {
        return "древесный";
    }
}
