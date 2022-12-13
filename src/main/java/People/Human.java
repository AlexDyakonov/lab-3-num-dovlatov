package People;

import Interfaces.Laugh;

public class Human extends Person implements Laugh {

    public Human() {
        super("Лишь один человек ");
    }

    @Override
    public String laugh(boolean negative) {
        if (!negative) {
            return (this.getFirstName() + "не смеяться");
        } else
            return (this.getFirstName() + "смеяться");
    }
}

