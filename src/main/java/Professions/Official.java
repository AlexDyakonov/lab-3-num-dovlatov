package Professions;

import Content.Substance;
import Enums.TIME;
import Materials.Materials;

public class Official extends Profession {
    public Official() {
        super("Чиновники");
    }

    public String hide(TIME time, Substance substance, Materials item){
        return (this.getName() + " " + time + " укутали " + substance.getStatus() + " " + substance.getName() + " " + item.getName());
    }


}
