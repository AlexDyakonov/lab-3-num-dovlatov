package Emotional;


import Enums.Handler;
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
        Handler h = new Handler();
        return (this.toString() + " " + h.handle(place) + " " + h.handle(time) + " сменилось " + emotion.toString());
    }
}
