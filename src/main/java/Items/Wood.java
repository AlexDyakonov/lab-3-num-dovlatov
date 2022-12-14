package Items;

import Interfaces.Adjectiveable;

public class Wood extends Item implements Adjectiveable {
    public Wood() {
        super("дерево");
    }

    @Override
    public String beAdjective() {
        return "древесный";
    }
}
