package People;

import Enums.*;
import Interfaces.Laugh;


public class NoName extends Person implements Laugh {
    private final boolean negative = true;
    public NoName() {
        super("", "");
    }

    public String laughTimePlace(TIME time, PLACE where){
        Handler h = new Handler();
        return (h.handle(time) + " " + laugh(negative) + " " + h.handle(where));
    }

    public String laughPlace(PLACE where){
        Handler h = new Handler();
        return (h.handle(where) + " " + this.getFirstName() + " " + laugh(negative));
    }
    @Override
    public String getFirstName() {
        return "кто-то";
    }

    @Override
    public String laugh(boolean negative) {
        if (!negative) {
            return ("не смеяться");
        } else
            return ("смеяться");
    }
}
