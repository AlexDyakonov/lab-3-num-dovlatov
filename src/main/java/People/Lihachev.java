package People;

import Enums.TIME;
import Interfaces.BeDrunkardMaster;
import Professions.Brigadier;
import Professions.Profession;

import java.util.HashSet;
import java.util.Set;

public class Lihachev extends Person implements BeDrunkardMaster {
    private final Profession profession;
    private final Set<Person> friendSet;
    public Lihachev() {
        super("Осип", "Лихачев");
        this.profession = new Brigadier();
        this.friendSet = new HashSet<>();
        friendSet.add(new ViktorC());
    }
    public void checkFriendList(){
        for (Person person : friendSet){
            System.out.print("Его помощника и друга - " + person.getFirstSecondName() + ".");
        }
    }

    public Profession whatProfession(){
        System.out.print(profession.getName() + " звали " + getFirstSecondName() + ".");
        return profession;
    }

    public void drink(TIME time) {
        System.out.print("Что не мешало " + getSecondName() + "y " + time + " запивать, а ");
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
        System.out.print("При этом " + getSecondName() + " выпивал  " + TIME.EVERYDAY +".");
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
