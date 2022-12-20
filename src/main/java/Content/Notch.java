package Content;

import Enums.PLACE;

public class Notch extends Substance{
    public Notch() {
        super("тысячи зарубок");
    }

    public String toBeMade(Machine machine, PLACE place){
        return (machine.withHelp() + place + "делаются " +getName());
    }
}
