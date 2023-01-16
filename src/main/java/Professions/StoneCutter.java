package Professions;

import Content.Machine;
import Content.Substance;
import Enums.STATUS;
import Enums.TIME;
import Exeptions.OutOfMachines;
import Materials.Materials;

import static StringMethods.StringMeth.capitalize;

public class StoneCutter extends Profession{

    private int machineNum;

    public StoneCutter() {
        super("камнерез");
    }

    public StoneCutter beArmedWith(int machineNum, TIME time){
        setMachineNum(machineNum);
        System.out.print(time + " " + getName() + " вооружается небольшим " + Machine.machines[machineNum] + ".");
        return this;
    }

    public StoneCutter constrict(Materials materials){
        System.out.print("Стесывает грубые напластования " + materials.getName() + ".");
        return this;
    }

    public void takes(int[] instruments){
        try {
            if (instruments.length > Machine.machines.length){
                throw new OutOfMachines("Недостаточно аппаратов.");
            }
            System.out.print("Берется за" + Machine.machines[instruments[0]] + " и " + Machine.machines[instruments[1]] +"(что-то вроде " + Machine.machines[instruments[2]] + " и " + Machine.machines[instruments[3]] +").");
        } catch (OutOfMachines e) {
            System.out.println();
        }

    }
    public void incorrectMove(){
        System.out.println("Одно неверное движение - и конец.");
    }

    public void takeOn(TIME time, Substance substance){
        System.out.print(time + " за дело берутся " + this.getName() + "ы.\n");
    }

    public StoneCutter handle(Substance substance){
        substance.setStatus(STATUS.NORMAL);
        System.out.print(capitalize(getName()) + " обрабатывает " + substance.getAdj().beAdjective() + " " + substance.getName() + ".");
        return this;
    }
    public int getMachineNum() {
        return machineNum;
    }

    public void setMachineNum(int machineNum) {
        this.machineNum = machineNum;
    }
}
