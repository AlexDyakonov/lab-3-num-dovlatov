package Content;

import Enums.STATUS;
import Interfaces.WhatInside;

public class Specie extends Substance implements WhatInside {

    public Specie() {
        super("породы", STATUS.DIFFERENT);
    }

    @Override
    public String whatInside() {
        return ("Есть многочисленные вкрапления " + getStatus() + " " + getName());
    }
}
