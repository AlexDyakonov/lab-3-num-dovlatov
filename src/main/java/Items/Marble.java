package Items;

import Interfaces.Adjectiveable;

public class  Marble extends Item implements Adjectiveable {

    public Marble(String name) {
        super(name);
    }

    @Override
    public void beAdjective() {
        System.out.println("мраморный");
    }
}
