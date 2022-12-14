package People;

import Items.Cap;
import Items.Item;

public class Lenin extends Person {
    public Lenin() {
        super("Ленин");
    }

    public String toSqueeze(Cap cap){
        Arm leninArm = new Arm();
        return (Cap.getCap((byte) -1) + getFirstName() + " сжимал в " + leninArm.getFist());
    }
    static class Arm{
        private final String fist = "кулак";
        public Arm() {
        }

        public String getFist() {
            return fist;
        }

    }

}


