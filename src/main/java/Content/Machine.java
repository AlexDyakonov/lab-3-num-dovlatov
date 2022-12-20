package Content;

import Enums.SPECIAL;


public class Machine extends Substance {
    public static final String[] machines = new String[]{" пунктир машины", " перфоратор ", " киянка", " скарпель ", " молоток", "зубило" };

    public Machine() {
        super("специальные устройства ");
    }

    public String named(int n){
        try {
            return (SPECIAL.SOCALLED + machines[n]);
        } catch (Exception e){
            return "";
        }
    }

    public String thisMachine(){
        return (SPECIAL.FORTHIS + " имеются " +getName() + named(0));
    }

    public String withHelp(){
        return ("С помощью этих" + machines[0]);
    }

    @Override
    public String toString() {
        return " все ";
    }
}
