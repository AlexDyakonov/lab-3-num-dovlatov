package Professions;

import Enums.Handler;
import Enums.PLACE;
import Interfaces.Exists;
import People.Person;

public class Sculptor extends Profession implements Exists {
    public Sculptor() {
        super("скульптор");
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

}
