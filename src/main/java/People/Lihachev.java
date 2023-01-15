package People;

import Enums.TIME;
import Interfaces.BeDrunkardMaster;
import Professions.Brigadier;
import Professions.Profession;

public class Lihachev extends Person implements BeDrunkardMaster {
    private final Profession profession;
    public Lihachev() {
        super("Осип", "Лихачев");
        this.profession = new Brigadier();
    }
    public String haveFriendHelper(Person person){
        return ("Его помощника и друга - " + getFirstSecondName());
    }

    public String whatProfession(){
        return (profession.getName() + " звали " + getFirstSecondName());
    }

    public String drinkRarely() {
        return ("Что не мешало " + getSecondName() + "y " + TIME.OCCASIONALLY + " запивать, а ");
    }

    @Override
    public void laugh(boolean negative) {
    }

    @Override
    public Boolean beDrunkard() {
        return true;
    }

    @Override
    public String drink() {
        return ("При этом " + getSecondName() + " выпивал  " + TIME.EVERYDAY +", ");
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
