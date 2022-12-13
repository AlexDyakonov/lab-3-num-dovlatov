package Enums;

public class PlaceHandler extends Handler {
    public static String placeHandle(Place place){
        String output = new String();
        switch (place){
            case SQUARE ->
                output += "вся площадь";
            case LENINGRAD ->
                output += "ленинградский";
            case SILENCE ->
                output += "В наступившей тишине";
        }
        return output;
    }

    @Override
    public String handle(Place place) {
        return placeHandle(place);
    }
}
