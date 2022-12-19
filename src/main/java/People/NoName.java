package People;

import Content.Substance;
import Enums.*;


public class NoName extends Person{
    private final boolean negative = true;
    public NoName() {
        super("", "");
    }

    public String remove(){
        return (getSecondName() + "убрать все лишнее");
    }

    public String copy(Substance substance){
        return (" скопировать " + substance.getAdj().beAdjective() + " " + substance.getName());
    }

    public String laughTimePlace(TIME time, PLACE where){
        return (time + " " + laugh(negative) + " " + where);
    }

    public String laughPlace(PLACE where){
        return (where + " " + this.getFirstName() + " " + laugh(negative));
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
