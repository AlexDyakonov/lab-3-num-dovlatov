package content;

import interfaces.Adjectiveable;
import interfaces.Exists;

import static stringMethods.StringMeth.capitalize;

public class Figure extends Substance implements Exists {

    public Figure(Adjectiveable adj) {
        super("фигура", adj);
    }

    @Override
    public String toString() {
        return (capitalize(toBe(true, (byte) 0)) + getAdj().beAdjective() + " " + this.getName());
    }

    @Override
    public String toBe(Boolean negative, int time) {
        String output = new String();
        if (negative & time == 0){
            output += "есть ";
        } else {
            output += "";
        }
        return output;
    }
}
