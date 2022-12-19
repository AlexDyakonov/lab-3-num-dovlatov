package People;

import Materials.Cap;

public class Lenin extends Person {
    public Lenin() {
        super("Ленин");
    }

    public String toSqueeze(Cap cap){
        Arm leninArm = new Arm();
        return (Cap.getCap((byte) -1) + getFirstName() + " сжимал в " + leninArm.getFist());
    }

    @Override
    public String laugh(boolean negative) {
        return null;
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


