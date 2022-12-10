public class Lenin extends Person{
    public Lenin(String firstName) {
        super(firstName);
    }

    public void squeezeInArm(){
        Arm leninArm = new Arm();
        System.out.println(leninArm.getAnother() + getFirstName() + " сжимал в " + (leninArm.getFist()) + ".");
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
