package Professions;

import Content.Substance;
import Enums.Handler;
import Enums.TIME;
import Items.Item;

public class Official extends Profession {
    public Official() {
        super("Чиновники");
    }

    public String hide(TIME time, Substance substance, Item item){
        Handler h = new Handler();
        return (this.getName() + " " + h.handle(time) + " укутали " + h.handle(substance.getStatus()) + " " + substance.getName() + " " + item.getName());
    }


}
