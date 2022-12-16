package Professions;

import Enums.Handler;
import Enums.TIME;

public class StoneCutter extends Profession{

    public StoneCutter() {
        super("камнерез");
    }

    public String takeOn(TIME time){
        Handler h = new Handler();
        return (h.handle(time) + " за дело берутся " + this.getName() + "ы.");
    }
}
