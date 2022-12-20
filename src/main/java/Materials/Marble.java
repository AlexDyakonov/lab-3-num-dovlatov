package Materials;

import Content.Substance;
import Enums.SPECIAL;
import Interfaces.Adjectiveable;
import Interfaces.WhatInside;

import static StringMethods.StringMeth.capitalize;

public class  Marble extends Materials implements Adjectiveable, WhatInside {

    public Marble() {
        super("мрамор");
    }

    public String construction(Substance substance){
        return ("Ведь строение " + getName() +"a подобно " + substance.getAdj().beAdjective()+ " " + substance.getName());
    }



    public String othersInside(Substance substance, Substance substance2){
        return ("Есть прочные " + substance.getAdj().beAdjective() + " " + substance.getName() + ".(" + capitalize(SPECIAL.LIKE.toString()) +" " + substance2.getAdj().beAdjective() + " " + substance2.getName() + ".)");
    }

    @Override
    public String beAdjective() {
        return "мраморный";
    }

    @Override
    public String whatInside(){
        return ("В " + getName() + " есть хрупкие слои, затвердения, трещины.");
    }
}
