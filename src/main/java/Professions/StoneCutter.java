package Professions;

import Enums.TIME;

public class StoneCutter extends Profession{

    public StoneCutter() {
        super("камнерез");
    }

    public String takeOn(TIME time){
        return (time + " за дело берутся " + this.getName() + "ы");
    }
}
