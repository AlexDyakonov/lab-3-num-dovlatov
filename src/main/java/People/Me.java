package People;

import Interfaces.Exists;

public class Me extends Person implements Exists {
    public Me() {
        super("Я");
    }

    @Override
    public String toBe(Boolean negative, byte time) {
        String output = new String();
        if (negative & time < 0){
            output += "был ";
        } else {
            output += "";
        }
        return output;
    }


}
