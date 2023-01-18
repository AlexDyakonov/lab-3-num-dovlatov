package professions;

import content.Substance;
import enums.TIME;
import materials.Materials;

public class Official extends Profession {
    public Official() {
        super("Чиновники");
    }

    public void hide(TIME time, Substance substance, Materials item){
        System.out.println(this.getName() + " " + time + " укутали " + substance.getStatus() + " " + substance.getName() + " " + item.getName() + ".");
    }


}
