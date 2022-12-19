package People;

public class Human extends Person {

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

