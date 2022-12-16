import Content.*;
import Emotional.*;
import Enums.*;
import Interfaces.Adjectiveable;
import Items.*;
import People.*;
import Professions.*;


public class Main {
    public static void main(String[] args) {
        String story = new String();
        Lenin lenin = new Lenin();
        Lihachev lihachev = new Lihachev();
        ViktorC viktorC = new ViktorC();
        ViktorD viktorD = new ViktorD();
        Cap[] caps = {new Cap(), new Cap()};
        Cap cap = new Cap();
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
        Monument monument1 = new Monument(STATUS.BROKEN);
        Figure figure = new Figure(new Clay());
        Molder molder = new Molder();
        StoneCutter stoneCutter = new StoneCutter();
        Figure figure1 = new Figure((Adjectiveable) gypsum);

        story += (m.faded() + nn.laughPlace(PLACE.SILENCE) + "." + nn.laughTimePlace(TIME.MINUTE, PLACE.SQUARE) + ". \n");
        story += (human.laugh(false) + "." + sculptor.toBePerson(viktorD) + "." + fear.change(PLACE.FACE, TIME.GRADUALLY, grimace) + ". \n");
        story += (h.handle(SPECIAL.WTF) + ""); sculptor.setStatus(STATUS.UNHAPPY); story += (sculptor.sculptorMade(new Cap[]{new Cap(), new Cap()}) + ".");
        story += (chief.cover(new Cap[]{new Cap()}) + "." + lenin.toSqueeze(new Cap()) + ". \n" + official.hide(TIME.HASTILY, (monument1), new Cloth(" серой ")) + ".\n");
        story += (monument.toBePublished(TIME.MORNING) + cap.removeCap(TIME.OVERNIGHT) + "\n" + me.disturbed(TIME.AGAIN) + "\n"); monument1.setStatus(STATUS.NORMAL); sculptor.setStatus(STATUS.NORMAL);
        story += (monument1.toBeBorn() + sculptor.sculptorMade(figure) + molder.cast(monument1, monument, gypsum) + stoneCutter.takeOn(TIME.LATER) + "\n");
        story += ((figure1) + "." + boulder.toBeDescrition() + "." + h.handle(SPECIAL.NECESSARY) + h.handle(SPECIAL.ASTHEYSAY) + nn.remove() + h.handle(SPECIAL.ABSOLUTELY) + nn.copy(figure1) + "\n");
        story += ("Для этого");
        System.out.println(story);
    }
}
