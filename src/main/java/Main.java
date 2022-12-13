import Content.Boulder;
import Content.Figure;
import Content.Monument;
import Content.Music;
import Enums.Handler;
import Enums.Place;
import Enums.Time;
import Interfaces.Adjectiveable;
import Items.Gypsum;
import Items.Item;
import Items.Marble;
import People.*;
import Professions.Sculptor;


public class Main {
    public static void main(String[] args) {
        Lenin lenin = new Lenin();
        Lihachev lihachev = new Lihachev();
        ViktorC viktorC = new ViktorC();
        ViktorD viktorD = new ViktorD();
        Me me = new Me();
        Person[] brigada = {me,  lihachev, viktorC};
        NoName nn = new NoName();
        Handler h = new Handler();
        Music m = new Music();
        Human human = new Human();
        Sculptor sculptor = new Sculptor();
        Monument monument = new Monument();
        Item gypsum = new Gypsum();
        Item marble = new Marble();
        Boulder boulder = new Boulder((Adjectiveable) marble);

        System.out.println();
    }
}
