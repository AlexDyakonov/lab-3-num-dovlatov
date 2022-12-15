package Content;

import Enums.Handler;
import Enums.STATUS;
import Enums.TIME;
import Interfaces.Exists;

public class Monument extends Substance implements Exists {
    public Monument() {
        super("памятник", STATUS.NORMAL);
    }
    public Monument(STATUS status){
        super("монумент", status);
    }

    public String toBePublished(TIME time){
        Handler h = new Handler();
        return (h.handle(time) + " " + this.getName() + " "+ toBe(true, (byte) -1) + "вновь обнародован.");
    }

    @Override
    public String toBe(Boolean negative, byte time) {
        String output = new String();
        if (negative & time < 0){
            output += "был ";
        } else {
            output += "";
        }
        return output;
    }
}
