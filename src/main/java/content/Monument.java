package content;

import enums.STATUS;
import enums.TIME;
import interfaces.Exists;

import static stringMethods.StringMeth.capitalize;

public class Monument extends Substance implements Exists {
    public Monument() {
        super("памятник", STATUS.UNPUBLISHED);
    }
    public Monument(STATUS status){
        super("монумент", status);
    }

    public void toBePublished(TIME time){
        setStatus(STATUS.PUBLISHED);
        System.out.print(time + " " + this.getName() + " "+ toBe(true, -1) + "вновь обнародован.");
    }

    public void toBeBorn(){
        setStatus(STATUS.NORMAL);
        System.out.print(capitalize(this.getName()) + " рождаются так.");
    }

    @Override
    public String toBe(Boolean negative, int time) {
        String output = "";
        if (negative & time < 0){
            output += "был ";
        } else {
            output += "";
        }
        return output;
    }
}
