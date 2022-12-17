package Professions;


import static StringMethods.StringMeth.capitalize;

import Content.Monument;
import Content.Substance;
import Items.Item;

public class Molder extends Profession{
    public Molder() {
        super("формовщик");
    }

    public String cast(Substance substance, Monument monument, Item item2){
        if (monument.equals(substance)){
            return (capitalize(this.getName()) + " отливает её в " + item2.getName());
        } else return "";
    }
}
