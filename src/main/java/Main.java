import Content.*;
import Emotional.*;
import Enums.*;
import Interfaces.Adjectiveable;
import Items.*;
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

        story += (m.faded() + dot(nn.laughPlace(PLACE.SILENCE)) + dotn(nn.laughTimePlace(TIME.MINUTE, PLACE.SQUARE)));
        story += (dot(human.laugh(false)) + dot(sculptor.toBePerson(viktorD)) + dotn(fear.change(PLACE.FACE, TIME.GRADUALLY, grimace)));
        story += (h.handle(SPECIAL.WTF)); sculptor.setStatus(STATUS.UNHAPPY); story += (dot(sculptor.sculptorMade(new Cap[]{new Cap(), new Cap()})));
        story += (dot(chief.cover(new Cap[]{new Cap()})) + dotn(lenin.toSqueeze(new Cap())) + dotn(official.hide(TIME.HASTILY, (monument1), new Cloth(" серой "))));
        story += (dot(monument.toBePublished(TIME.MORNING)) + dotn(cap.removeCap(TIME.OVERNIGHT)) + dotn(me.disturbed(TIME.AGAIN))); monument1.setStatus(STATUS.NORMAL); sculptor.setStatus(STATUS.NORMAL);
        story += (dot(monument1.toBeBorn()) + dot(sculptor.sculptorMade(figure)) + dot(molder.cast(monument1, monument, gypsum)) + stoneCutter.takeOn(TIME.LATER) + "\n");
        story += ((figure1) + "." + dot(boulder.toBeDescrition()) + h.handle(SPECIAL.NECESSARY) + h.handle(SPECIAL.ASTHEYSAY) + dot(nn.remove()) + h.handle(SPECIAL.ABSOLUTELY) + dotn(nn.copy(figure1)));
        story += (h.handle(SPECIAL.FORTHIS));
        System.out.println(story);

        try(FileWriter outputText = new FileWriter(new File("E:\\code\\text-lab3\\src\\main\\resources", "output.txt"))){
            outputText.write(story);
        } catch (IOException e) {
            System.out.println("Не удалось создать файл.");
        }

    }
}
