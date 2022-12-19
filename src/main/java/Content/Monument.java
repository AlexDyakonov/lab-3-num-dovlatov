package Content;

import UNUSED.Handler;
import Enums.STATUS;
import Enums.TIME;
import Interfaces.Exists;

import static StringMethods.StringMeth.capitalize;

public class Monument extends Substance implements Exists {
    public Monument() {
        super("памятник", STATUS.NORMAL);
    }
    public Monument(STATUS status){
        super("монумент", status);
    }

    public String toBePublished(TIME time){
        Handler h = new Handler();
        return (time + " " + this.getName() + " "+ toBe(true, (byte) -1) + "вновь обнародован");
    }

    public String toBeBorn(){
        return (capitalize(this.getName()) + " рождаются так");
    }

    @Override
    public String toBe(Boolean negative, int time) {
        String output = new String();
        if (negative & time < 0){
            output += "был ";
        } else {
            output += "";
        }
        return output;
    }
}
