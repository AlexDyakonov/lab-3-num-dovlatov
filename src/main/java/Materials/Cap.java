package Materials;

import Enums.TIME;

public class Cap extends Materials {
    public Cap() {
        super("кепка");
    }

    public static String getCap(byte amount){
        String output = "";
        switch (amount){
            case -1 ->
                output += "Другую ";
            case 0 ->
                output += "кепка ";
            case 1 ->
                output += "кепки ";
            default ->
                output = null;
        }
        return output;
    }

    public String removeCap(TIME time){
        return (time + " лишнюю " + this.getName() + " убрали");
    }

}
