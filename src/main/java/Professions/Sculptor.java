package Professions;

import Enums.Handler;
import Enums.PLACE;
import Enums.STATUS;
import Interfaces.Exists;
import Items.Item;
import People.Person;

public class Sculptor extends Profession implements Exists {

    public Sculptor(STATUS status) {
        super("скульптор", status);
    }


    public String make(Item[] items){
        String output = new String();
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

    public String toBePerson(Person person){
        Handler h = new Handler();
        return ("Это " + toBe(true, (byte) -1) + h.handle(PLACE.LENINGRAD) + " " + this.getName() + " " + person.getFirstSecondName());
    }


    @Override
    public String toBe(Boolean negative, byte time){
        String output = new String();
        if (negative & time < 0){
            output += "был ";
        } else {
            output += "";
        }
        return output;
    }

    @Override
    public String toString() {
        Handler h = new Handler();
        return (h.handle(this.getStatus()) + " " + this.getName());
    }
}
