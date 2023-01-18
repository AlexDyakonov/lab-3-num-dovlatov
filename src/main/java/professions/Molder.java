package professions;


import static stringMethods.StringMeth.capitalize;

import content.Monument;
import content.Substance;
import materials.Materials;

public class Molder extends Profession{
    public Molder() {
        super("формовщик");
    }

    public Substance cast(Substance substance, Monument monument, Materials item2){
        if (monument.equals(substance)){
            System.out.print(capitalize(this.getName()) + " отливает её в " + item2.getName() + ".");
            return substance;
        } else return null;
    }
}
