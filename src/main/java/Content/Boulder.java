package Content;

import Interfaces.Adjectiveable;
import Interfaces.Exists;

public class Boulder extends Substance implements Exists {

    public Boulder(Adjectiveable adj) {
        super("глыба", adj);
    }


    public Substance toBeDescrition() {
        System.out.print(toBe(true, (byte) 0) + "бесформенная " + getAdj().beAdjective() + " " + this.getName()+ ".");
        return this;
    }

    @Override
    public String toBe(Boolean negative, int time) {
        String output = new String();
        if (negative & time == 0){
            output += "И есть ";
        } else {
            output += "";
        }
        return output;
    }
}
