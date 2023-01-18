package content;

import enums.PLACE;


public class Machine extends Substance {
    public static final String[] machines = new String[]{" пунктир машины", " перфоратор", " киянка", " скарпель ", " молоток", "зубило" };

    public Machine() {
        super("специальные устройства ");
    }

    public void named(int n){
        try {
            System.out.print(", так называемые " + machines[n]);
        } catch (Exception e){
            System.out.println();
        }
    }

    public Machine thisMachine(int numOfMachine){
        System.out.print("Для этого имеются " +getName() + " ");
        named(numOfMachine);
        System.out.print(".");
        return this;
    }

    public void withHelp(){
        System.out.print("С помощью этих" + machines[0]);
    }

    public Notch makeNotch (PLACE place){
        Notch notch = new Notch();
        withHelp();
        System.out.print(place + "делаются " + notch.getName() + ".");
        return notch;
    }

    @Override
    public String toString() {
        return " все ";
    }
}
