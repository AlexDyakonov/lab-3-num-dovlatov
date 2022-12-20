package Professions;

import Content.Machine;
import Content.Substance;
import Enums.SPECIAL;
import Enums.TIME;
import Exeptions.OutOfMachines;
import Materials.Materials;

import static StringMethods.StringMeth.capitalize;

public class StoneCutter extends Profession{

    public StoneCutter() {
        super("камнерез");
    }

    public String beArmedWith(int machineNum){
        return (" " + getName() + " вооружается небольшим " + Machine.machines[machineNum]);
    }

    public String constrict(Materials materials){
        return ("Стесывает грубые напластования " + materials.getName());
    }

    public String takes(int[] instruments){
        try {
            if (instruments.length > Machine.machines.length){
                throw new OutOfMachines();
            }
            return ("Берется за" + Machine.machines[instruments[0]] + " и " + Machine.machines[instruments[1]] +"(" + SPECIAL.LIKE + Machine.machines[instruments[2]] + " и " + Machine.machines[instruments[3]] +")");
        } catch (OutOfMachines e) {
            return "";
        }

    }
    public String incorrectMove(){
        return "Одно неверное движение - и конец.";
    }

    public String takeOn(TIME time){
        return (time + " за дело берутся " + this.getName() + "ы");
    }

    public String handle(Substance substance){
        return (capitalize(getName()) + " обрабатывает " + substance.getAdj().beAdjective() + " " + substance.getName());
    }
}
