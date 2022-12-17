package People;

import Enums.Handler;
import Enums.TIME;
import Interfaces.Exists;

public class Me extends Person implements Exists {
    public Me() {
        super("Я");
    }
    public String disturbed(TIME time){
        Handler h = new Handler();
        return ("Мы " + h.handle(time) + " отвлеклись");
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
