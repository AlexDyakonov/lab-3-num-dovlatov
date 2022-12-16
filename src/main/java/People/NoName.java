package People;

import Content.Substance;
import Enums.*;
import Interfaces.Laugh;
import Items.Item;


public class NoName extends Person implements Laugh {
    private final boolean negative = true;
    public NoName() {
        super("", "");
    }

    public String remove(){
        return (getSecondName() + "убрать все лишнее.");
    }

    public String copy(Substance substance){
        return (" скопировать " + substance.getAdj().beAdjective() + " " + substance.getName() + ".");
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
