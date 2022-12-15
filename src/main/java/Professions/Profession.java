package Professions;

import Enums.STATUS;

public abstract class Profession {
    private final String name;
    private STATUS status;

    public Profession(String name) {
        this.name = name;
        this.status = STATUS.NORMAL;
    }

    public Profession(String name, STATUS status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }
    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

}