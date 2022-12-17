package Enums;

public class PlaceHandler extends Handler {
    public static String placeHandle(PLACE place){
        String output = new String();
        switch (place){
            case SQUARE ->
                output += "вся площадь";
            case LENINGRAD ->
                output += "ленинградский";
            case SILENCE ->
                output += "В наступившей тишине";
            case FACE ->
                    output += "на его лице";
            case NOWHERE ->
                    output += "нигде";
            case NOPLACE ->
                    output += "нигде";
        }
        return output;
    }
}
