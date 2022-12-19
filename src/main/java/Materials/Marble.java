package Materials;

import Interfaces.Adjectiveable;

public class  Marble extends Materials implements Adjectiveable {

    public Marble() {
        super("мрамор");
    }

    @Override
    public String beAdjective() {
        return "мраморный";
    }
}
