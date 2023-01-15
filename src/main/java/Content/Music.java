package Content;

import Enums.PLACE;
import Enums.STATUS;

import static StringMethods.StringMeth.dot;

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