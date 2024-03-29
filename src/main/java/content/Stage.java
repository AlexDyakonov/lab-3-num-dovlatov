package content;

import enums.STATUS;

public class Stage extends Substance{
    public Stage(STATUS status) {
        super("этап", status);
    }

    public String await(){
        return ("Предстоит " + getStatus() + " " + getName());
    }
}
