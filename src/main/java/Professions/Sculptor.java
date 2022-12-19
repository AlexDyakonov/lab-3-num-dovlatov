package Professions;

import Content.Substance;
import UNUSED.Handler;
import Enums.PLACE;
import Enums.STATUS;
import Interfaces.Exists;
import Items.Item;
import People.Person;

import static StringMethods.StringMeth.capitalize;

public class Sculptor extends Profession implements Exists {

    public Sculptor(STATUS status) {
        super("скульптор", status);
    }


    public String make(Item[] items){
        String output = "";
        switch (items.length){
            case 1 -> output += items[0].getName();
            case 2 -> output += "две " + items[0].getName();
            default -> output += "";
        }
        return (" изваял " + output);
    }

    public String sculptorMade(Item[] items){
        return (this.toString() + make(items));
    }

    public String sculptorMade(Substance substance){
        return (capitalize(this.getName()) + " лепит " + substance.getAdj().beAdjective() + " " + substance.getName());
    }

    public String toBePerson(Person person){
        Handler h = new Handler();
        return ("Это " + toBe(true, (byte) -1) + PLACE.LENINGRAD + " " + this.getName() + " " + person.getFirstSecondName());
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
