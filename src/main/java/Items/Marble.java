package Items;

import Interfaces.Adjectiveable;

public class  Marble extends Item implements Adjectiveable {

    public Marble() {
        super("мрамор");
    }

    @Override
    public String beAdjective() {
        return "мраморный";
    }
}
