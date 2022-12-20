package People;

import Enums.TIME;
import Interfaces.Exists;
import Professions.Profession;

public class Me extends Person implements Exists {
    public Me() {
        super("Я", "Меня");
    }
    public String disturbed(TIME time){
        return ("Мы " + time + " отвлеклись");
    }
    public String enlisted(Profession profession){
        return (getSecondName() + " зачислили в бригаду " + profession.getName());
    }
    public String count(Person[] brigada){
        if(brigada.length == 3){
            return "Нас было трое.";
        } else return "";
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
    public String laugh(boolean negative) {
        return null;
    }
}
