package Professions;

import Content.Substance;
import Enums.TIME;
import Items.Item;

public class Official extends Profession {
    public Official() {
        super("Чиновники");
    }

    public String hide(TIME time, Substance substance, Item item){
        return (this.getName() + " " + time + " укутали " + substance.getStatus() + " " + substance.getName() + " " + item.getName());
    }


}
