package Items;

import Enums.Handler;
import Enums.TIME;

public class Cap extends Item{
    public Cap() {
        super("кепка");
    }

    public static String getCap(byte amount){
        String output = new String();
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
        Handler h = new Handler();
        return (h.handle(time) + " лишнюю " + this.getName() + " убрали");
    }

}
