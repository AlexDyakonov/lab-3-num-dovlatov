package content;

import enums.PLACE;
import enums.STATUS;

import static stringMethods.StringMeth.dot;

public class Music extends Substance{
    public Music() {
        super("Музыка", STATUS.NORMAL);
    }

    public PLACE faded(){
        setStatus(STATUS.FADED);
        System.out.print(dot(getName() + getStatus()));
        return PLACE.SILENCE;
    }
}