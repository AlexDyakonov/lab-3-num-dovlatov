package People;

import Content.Substance;
import Enums.*;

import static StringMethods.StringMeth.dot;


public class NoName extends Person{
    private final boolean negative = true;
    public NoName() {
        super("", "");
    }

    public String remove(){
        return (getSecondName() + "убрать все лишнее");
    }

    public String copy(Substance substance){
        return (" скопировать " + substance.getAdj().beAdjective() + " " + substance.getName());
    }

    public void laughTimePlace(TIME time, PLACE where){
        System.out.print(". " + time + " ");
        laugh(negative);
        System.out.print(" " + where + ". \n");
    }

    public void laughPlace(PLACE where){
        System.out.print((where + " " + getFirstName() + " "));
        laugh(negative);
    }
    @Override
    public String getFirstName() {
        return "кто-то";
    }

    @Override
    public void laugh(boolean negative) {
        if (!negative) {
            System.out.print("не смеяться");
        } else
            System.out.print("смеяться");
    }
}