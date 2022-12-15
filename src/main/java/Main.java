import Content.Boulder;
import Content.Monument;
import Content.Music;
import Emotional.Fear;
import Emotional.Grimace;
import Enums.Handler;
import Enums.*;
import Interfaces.Adjectiveable;
import Items.*;
import People.*;
import Professions.Chief;
import Professions.Official;
import Professions.Profession;
import Professions.Sculptor;


public class Main {
    public static void main(String[] args) {
        String story = new String();
        Lenin lenin = new Lenin();
        Lihachev lihachev = new Lihachev();
        ViktorC viktorC = new ViktorC();
        ViktorD viktorD = new ViktorD();
        Cap[] caps = {new Cap(), new Cap()};
        Me me = new Me();
        Person[] brigada = {me,  lihachev, viktorC};
        NoName nn = new NoName();
        Handler h = new Handler();
        Music m = new Music();
        Human human = new Human();
        Sculptor sculptor = new Sculptor(STATUS.NORMAL);
        Monument monument = new Monument();
        Item gypsum = new Gypsum();
        Item marble = new Marble();
        Boulder boulder = new Boulder((Adjectiveable) marble);
        Grimace grimace = new Grimace(new STATUS[]{STATUS.HOPELESSNESS, STATUS.INDIFFERENCE});
        Fear fear = new Fear();
        Chief chief = new Chief();
        Official official = new Official();

        story += (m.faded() + nn.laughPlace(PLACE.SILENCE) + "." + nn.laughTimePlace(TIME.MINUTE, PLACE.SQUARE) + ". \n");
        story += (human.laugh(false) + "." + sculptor.toBePerson(viktorD) + "." + fear.change(PLACE.FACE, TIME.GRADUALLY, grimace) + ". \n");
        story += (h.handle(SPECIAL.WTF) + ""); sculptor.setStatus(STATUS.UNHAPPY); story += (sculptor.sculptorMade(new Cap[]{new Cap(), new Cap()}) + ".");
        story += (chief.cover(new Cap[]{new Cap()}) + "." + lenin.toSqueeze(new Cap()) + ". \n" + official.hide(TIME.HASTILY, (new Monument(STATUS.BROKEN)), new Cloth(" серой ")) + ".");
        story += ("\n");
        System.out.println(story);
    }
}
