package Enums;

public enum PLACE {
    SQUARE ("вся площадь"),
    LENINGRAD ("ленинградский"),
    SILENCE ("В наступившей тишине"),
    FACE ("на его лице"),
    NOWHERE ("нигде"),
    NOPLACE ("");

    private final String place;
    PLACE (String place) {
        this.place = place;
    }
    public String getPlace() {
        return place;
    }
    @Override
    public String toString() {
        return place;
    }
}