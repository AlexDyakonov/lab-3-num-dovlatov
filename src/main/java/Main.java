import Content.*;
import Emotional.*;
import Enums.*;
import Interfaces.Adjectiveable;
import Materials.*;
import People.*;
import Professions.*;

import static StringMethods.StringMeth.*;


public class Main {
    public static void main(String[] args) {
        String story = "";
        Lenin lenin = new Lenin();
        Lihachev lihachev = new Lihachev();
        ViktorC viktorC = new ViktorC();
        ViktorD viktorD = new ViktorD();
        Cap cap = new Cap();
        Me me = new Me();
        Person[] brigada = {me,  lihachev, viktorC};
        NoName nn = new NoName();
        Music m = new Music();
        Human human = new Human();
        Sculptor sculptor = new Sculptor(STATUS.NORMAL);
        Materials gypsum = new Gypsum();
        Materials marble = new Marble();
        Boulder boulder = new Boulder((Adjectiveable) marble);
        Grimace grimace = new Grimace(new STATUS[]{STATUS.HOPELESSNESS, STATUS.INDIFFERENCE});
        Fear fear = new Fear();
        Monument monument1 = new Monument(STATUS.BROKEN);
        Chief chief = new Chief();
        Official official = new Official();
        Figure figure = new Figure(new Clay());
        Molder molder = new Molder();
        StoneCutter stoneCutter = new StoneCutter();
        Figure figure1 = new Figure((Adjectiveable) gypsum);
        Machine machine= new Machine();
        Notch notch = new Notch();
        Conture conture = new Conture();
        Work work = new Work(new STATUS[]{STATUS.RESPONSIBLE, STATUS.ACCURACY});
        Marble marble1 = new Marble();


        nn.laughPlace(m.faded()); nn.laughTimePlace(TIME.MINUTE, PLACE.SQUARE);
        human.toBeLaughPerson(sculptor.toBePerson(viktorD));
        fear.change(PLACE.FACE, TIME.GRADUALLY, grimace);
        sculptor.sculptorMade(new Cap[]{new Cap(), new Cap()});
        chief.cover(new Cap[]{new Cap()});
        lenin.toSqueeze(new Cap());
        official.hide(TIME.HASTILY, monument1, new Cloth(" серой "));
        monument1.toBePublished(TIME.MORNING);
        cap.removeCap(TIME.OVERNIGHT);
        me.disturbed(TIME.AGAIN);
        monument1.toBeBorn();
        stoneCutter.takeOn(TIME.LATER, molder.cast(monument1, sculptor.sculptorMade(figure), gypsum));
        System.out.print(figure1 + ".");
        nn.remove(boulder.toBeDescrition());
        nn.copy(figure1);
        machine.thisMachine(0).makeNotch(PLACE.STONE);
        conture.contureOf(monument1, STATUS.FUTURE);
        stoneCutter.beArmedWith(1, TIME.AFTER).constrict(marble).takes(new int[]{2, 3, 4, 5});
        work.finalStage(new Stage(STATUS.FINAL));
        stoneCutter.handle(new Surface(marble1)).incorrectMove();
        (marble1).consitsOf(new Branch(new Wood()));
        System.out.println(work);
        story += (dot(me.enlisted(stoneCutter)) + me.count(brigada) + dot(lihachev.whatProfession()) + dot(lihachev.haveFriendHelper(viktorC)) + dotn(human.beDrunkMaster(lihachev, viktorC)));
        story += (lihachev.drink() + viktorC.drink() + lihachev.drinkRarely() + viktorC.drinkEveryday() + ".");

        System.out.println(story);
    }
}
