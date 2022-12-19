package Emotional;


import Enums.PLACE;
import Enums.STATUS;
import Enums.TIME;

public class Fear extends Emotion {
    public Fear() {
        super("Выражение ужаса", new STATUS[]{STATUS.NORMAL});
    }

    public Fear(STATUS[] status) {
        super("Выражение ужаса", status);
    }
    public String change(PLACE place, TIME time, Emotion emotion){
        return (this.toString() + " " + place + " " + time + " сменилось " + emotion.toString());
    }
}
