package Emotional;

import Enums.Handler;
import Enums.STATUS;

import java.util.Arrays;

public abstract class Emotion {
    private final String name;
    private STATUS[] status;

    public Emotion(String name) {
        this.name = name;
    }

    public Emotion(String name, STATUS[] status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder statusInfo = new StringBuilder();
        Handler h = new Handler();
        for(STATUS item : status)
            statusInfo.append(h.handle(item)).append(" ");
        return (this.getName() + " " + statusInfo.toString());
    }

    public STATUS[] getStatus() {
        return status;
    }

    public void setStatus(STATUS[] status) {
        this.status = status;
    }
}
