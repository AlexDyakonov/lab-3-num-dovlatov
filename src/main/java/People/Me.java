package People;

import Enums.TIME;
import Interfaces.Exists;
import Professions.Profession;

import java.util.Set;

public class Me extends Person implements Exists {
    public Me() {
        super("Я", "Меня");
    }
    public void disturbed(TIME time){
        System.out.println("Мы " + time + " отвлеклись");
    }
    public Set<Person> enlistedToBrigada(Profession profession, Set<Person> brigada){
        System.out.print(getSecondName() + " зачислили в бригаду " + profession.getName() + ".");
        brigada.add(this);
        return brigada;
    }
    public void countPersonInBrigada(Set<Person> brigada){
        if(brigada.size() == 3){
            System.out.print("Нас было трое.");
        } else System.out.print("");
    }

    @Override
    public String toBe(Boolean negative, int time) {
        String output = "";
        if (negative & time < 0){
            output += "был ";
        } else {
            output += "";
        }
        return output;
    }


    @Override
    public void laugh(boolean negative) {
    }
}
