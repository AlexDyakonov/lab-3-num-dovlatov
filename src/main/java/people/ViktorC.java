package people;

import enums.TIME;
import interfaces.BeDrunkardMaster;



public class ViktorC extends Person implements BeDrunkardMaster {
    public ViktorC() {
        super("Виктор", "Цыпин");
    }

    public void drink(TIME time) {
        System.out.print(getSecondName() + "y опохмеляться " + time + ".");
    }

    @Override
    public void laugh(boolean negative) {
    }

    @Override
    public Boolean beDrunkard() {
        return true;
    }

    @Override
    public void drink() {
        System.out.print(getSecondName() + " страдал хроническими запоями.");
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
