package Professions;

import Content.Substance;
import Enums.PLACE;
import Enums.SPECIAL;
import Enums.STATUS;
import Interfaces.Exists;
import Materials.Materials;
import People.Person;

import static StringMethods.StringMeth.capitalize;

public class Sculptor extends Profession implements Exists {

    public Sculptor(STATUS status) {
        super("скульптор", status);
    }


    public String make(Materials[] items){
        String output = "";
        switch (items.length){
            case 1 -> output += items[0].getName();
            case 2 -> output += "две " + items[0].getName();
            default -> output += "";
        }
        return (" изваял " + output);
    }

    public void sculptorMade(Materials[] items){
        System.out.print(this.toString() + make(items) + ".");
    }

    public String sculptorMade(Substance substance){
        return (capitalize(this.getName()) + " лепит " + substance.getAdj().beAdjective() + " " + substance.getName());
    }

    public Person toBePerson(Person person){
        setStatus(STATUS.UNHAPPY);
        System.out.print("Это " + toBe(true, -1) + PLACE.LENINGRAD + " " + this.getName() + " " + person.getFirstSecondName() + ".");
        return person;
    }


    @Override
    public String toBe(Boolean negative, int time){
        String output = "";
        if (negative & time < 0){
            output += "был ";
        } else {
            output += "";
        }
        return output;
    }

    @Override
    public String toString() {
        return (this.getStatus() + " " + this.getName());
    }
}
