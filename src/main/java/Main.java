import Content.*;
import Emotional.*;
import Enums.*;
import Interfaces.Adjectiveable;
import Materials.*;
import People.*;
import Professions.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
        Monument monument = new Monument();
        Materials gypsum = new Gypsum();
        Materials marble = new Marble();
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
        Machine machine= new Machine();
        Notch notch = new Notch();
        Conture conture = new Conture();
        Work work = new Work(new STATUS[]{STATUS.RESPONSIBLE, STATUS.ACCURACY});
        Marble marble1 = new Marble();

        story += (m.faded() + dot(nn.laughPlace(PLACE.SILENCE)) + dotn(nn.laughTimePlace(TIME.MINUTE, PLACE.SQUARE)));
        story += (dot(human.laugh(false)) + dot(sculptor.toBePerson(viktorD)) + dotn(fear.change(PLACE.FACE, TIME.GRADUALLY, grimace)));
        story += (SPECIAL.WTF); sculptor.setStatus(STATUS.UNHAPPY); story += (dot(sculptor.sculptorMade(new Cap[]{new Cap(), new Cap()})));
        story += (dot(chief.cover(new Cap[]{new Cap()})) + dotn(lenin.toSqueeze(new Cap())) + dotn(official.hide(TIME.HASTILY, (monument1), new Cloth(" серой "))));
        story += (dot(monument.toBePublished(TIME.MORNING)) + dotn(cap.removeCap(TIME.OVERNIGHT)) + dotn(me.disturbed(TIME.AGAIN))); monument1.setStatus(STATUS.NORMAL); sculptor.setStatus(STATUS.NORMAL);
        story += (dot(monument1.toBeBorn()) + dot(sculptor.sculptorMade(figure)) + dot(molder.cast(monument1, monument, gypsum)) + dotn(stoneCutter.takeOn(TIME.LATER)));
        story += ((figure1) + "." + dot(boulder.toBeDescrition()) + SPECIAL.NECESSARY + SPECIAL.ASTHEYSAY + dot(nn.remove()) + SPECIAL.ABSOLUTELY + dotn(nn.copy(figure1)));
        story += (dot(machine.thisMachine()) + dot(notch.toBeMade(machine, PLACE.STONE))) + dotn(conture.contureOf(monument1, STATUS.FUTURE));
        story += (TIME.AFTER + dot(stoneCutter.beArmedWith(1)) + dot(stoneCutter.constrict(marble)) + dot(stoneCutter.takes(new int[]{2, 3, 4, 5})) + dotn(work.finalStage(new Stage(STATUS.FINAL))));
        story += (dot(stoneCutter.handle(new Surface(marble1))) + stoneCutter.incorrectMove() + dot((marble1).construction(new Branch(new Wood()))) + marble1.whatInside());
        story += (marble1.othersInside(new Clot(new Facture()), new Branch(new Wood())) + dot(new Specie().whatInside()) +  dot(SPECIAL.ANDSOON.toString()) + SPECIAL.INGENERAL + work );
        story += (dot(me.enlisted(stoneCutter)) + me.count(brigada) + dot(lihachev.whatProfession()) + dot(lihachev.haveFriendHelper(viktorC)) + dotn(human.beDrunkMaster(lihachev, viktorC)));
        story += (lihachev.drink() + viktorC.drink() + lihachev.drinkRarely() + viktorC.drinkEveryday() + ".");

        System.out.println(story);
    }
}
