package People;

import Content.Monument;
import Content.Substance;
import Enums.STATUS;
import Materials.Cap;

public class Lenin extends Person {
    public Lenin() {
        super("Ленин");
    }

    public void toSqueeze(Cap cap){
        Arm leninArm = new Arm();
        System.out.print(Cap.getCap((byte) -1) + getFirstName() + " сжимал в " + leninArm.getFist() + ".\n");
    }

    @Override
    public void laugh(boolean negative) {
        System.out.println(getFirstName() + " смеется.");
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


