package Materials;

import Content.Branch;
import Content.Clot;
import Content.Specie;
import Content.Substance;
import Interfaces.Adjectiveable;
import Interfaces.WhatInside;

public class  Marble extends Materials implements Adjectiveable, WhatInside {

    public Marble() {
        super("мрамор");
    }

    public void consitsOf(Substance substance){
        System.out.print("Ведь строение " + getName() +"a подобно " + substance.getAdj().beAdjective()+ " " + substance.getName() + ".");
        whatInside();
        othersInside(new Clot(new Facture()), new Branch(new Wood()));
        System.out.print(new Specie().whatInside() + ".");
    }



    public Substance[] othersInside(Substance substance, Substance substance2){
        Substance[] substancesInside = {substance, substance2};
        System.out.print("Есть прочные " + substance.getAdj().beAdjective() + " " + substance.getName() + ".( Что-то вроде " + substance2.getAdj().beAdjective() + " " + substance2.getName() + ".)");
        return substancesInside;
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
