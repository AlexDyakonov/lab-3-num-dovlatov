package People;

import Enums.TIME;
import Interfaces.BeDrunkardMaster;



public class ViktorC extends Person implements BeDrunkardMaster {
    public ViktorC() {
        super("Виктор", "Цыпин");
    }

    public String drinkEveryday() {
        return (getSecondName() + "y опохмеляться " + TIME.OPPORTUNITY);
    }

    @Override
    public String laugh(boolean negative) {
        return null;
    }
    @Override
    public Boolean beDrunkard() {
        return true;
    }

    @Override
    public String drink() {
        return "a " + getSecondName() + " страдал хроническими запоями.";
    }

    @Override
    public Boolean beMaster() {
        return true;
    }

    @Override
    public boolean beDrunkardMaster() {
        return true;
    }
}
