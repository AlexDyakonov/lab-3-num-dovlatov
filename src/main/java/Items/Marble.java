package Items;

import Interfaces.Adjectiveable;

public class  Marble extends Item implements Adjectiveable {

    public Marble() {
        super("мрамор");
    }

    @Override
    public void beAdjective() {
        System.out.println("мраморный");
    }
}
