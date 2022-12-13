package People;

public class Lenin extends Person {
    public Lenin() {
        super("Ленин");
    }

    public void squeezeInArm(){
        Arm leninArm = new Arm();
        System.out.println(leninArm.getAnother() + getFirstName() + " сжимал в " + (leninArm.getFist()) + ".");
    }

    @Override
    public Lenin toBe(Boolean negative, byte time) {
        if (negative == Boolean.TRUE){
            System.out.println(getFirstName() + " не быть");
        } else {
            System.out.println(getFirstName() + " быть");
        }
        return this;
    }

    class Arm{
        String fist = "кулак";
        String another = "В другой ";
        public Arm() {
        }

        public String getFist() {
            return fist;
        }

        public String getAnother() {
            return another;
        }
    }
}
