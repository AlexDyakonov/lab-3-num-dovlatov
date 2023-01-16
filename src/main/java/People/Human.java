package People;

import Interfaces.BeDrunkardMaster;

import static StringMethods.StringMeth.dot;

public class Human extends Person {

    public Human() {
        super("Лишь один человек ", "Оба");
    }

    public String beDrunkMaster(BeDrunkardMaster dm1, BeDrunkardMaster dm2){
        if (dm1.beDrunkardMaster() == dm2.beDrunkardMaster()){
            return "Оба были мастерами своего дела и разумеется горькими пьяницами";
        } else return "";
    }

    public void toBeLaughPerson(Person person){
        laugh(false);
    }

    @Override
    public void laugh(boolean negative) {
        if (!negative) {
            System.out.print(dot(getFirstName() + "не смеяться"));
        } else
            System.out.print(dot(getFirstName() + "смеяться"));
    }
}

