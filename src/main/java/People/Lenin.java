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

}
class Arm{
    String fist = "кулак";
    public Arm() {
    }

    public String getFist() {
        return fist;
    }

}


/*

    @Override
    public Lenin toBe(Boolean negative, byte time) {
        if (negative == Boolean.TRUE){
            System.out.println(getFirstName() + " не быть");
        } else {
            System.out.println(getFirstName() + " быть");
        }
        return this;
    }


*/