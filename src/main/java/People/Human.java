package People;

import Enums.SPECIAL;
import Interfaces.BeDrunkardMaster;

public class Human extends Person {

    public Human() {
        super("Лишь один человек ", "Оба");
    }

    public String beDrunkMaster(BeDrunkardMaster dm1, BeDrunkardMaster dm2){
        if (dm1.beDrunkardMaster() == dm2.beDrunkardMaster()){
            return "Оба были мастерами своего дела и " + SPECIAL.OFC + " горькими пьяницами";
        } else return "";
    }

    @Override
    public String laugh(boolean negative) {
        if (!negative) {
            return (this.getFirstName() + "не смеяться");
        } else
            return (this.getFirstName() + "смеяться");
    }
}

