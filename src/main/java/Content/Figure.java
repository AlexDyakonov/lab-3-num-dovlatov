package Content;

import Interfaces.Adjectiveable;
import Interfaces.Exists;

public class Figure extends Substance implements Exists {

    public Figure(Adjectiveable adj) {
        super("фигура", adj);
    }

    @Override
    public String toString() {
        return (toBe(true, (byte) 0) + getAdj().beAdjective() + " " + this.getName());
    }

    @Override
    public String toBe(Boolean negative, byte time) {
        String output = new String();
        if (negative & time == 0){
            output += "есть ";
        } else {
            output += "";
        }
        return output;
    }
}