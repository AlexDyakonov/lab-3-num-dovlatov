import Content.Monument;
import Content.Music;
import Enums.Handler;
import Enums.Place;
import Enums.Time;
import People.*;
import Professions.Sculptor;


public class Main {
    public static void main(String[] args) {
        Lenin lenin = new Lenin();
        Lihachev lihachev = new Lihachev();
        ViktorC viktorC = new ViktorC();
        ViktorD viktorD = new ViktorD();
        NoName nn = new NoName();
        Handler h = new Handler();
        Music m = new Music();
        Human human = new Human();
        Sculptor sculptor = new Sculptor();
        Monument monument = new Monument();

        System.out.println(monument.toBePublished(Time.MORNING));
    }
}
