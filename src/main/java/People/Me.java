package People;

import Enums.TIME;
import Interfaces.Exists;

public class Me extends Person implements Exists {
    public Me() {
        super("Я");
    }
    public String disturbed(TIME time){
        return ("Мы " + time + " отвлеклись");
    }

    @Override
    public String toBe(Boolean negative, int time) {
        String output = "";
        if (negative & time < 0){
            output += "был ";
        } else {
            output += "";
        }
        return output;
    }


    @Override
    public String laugh(boolean negative) {
        return null;
    }
}
