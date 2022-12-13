package Enums;

public class Handler {
    public String handle(Place place) {
        return PlaceHandler.placeHandle(place);
    }
    public String handle(Time time) {
        return TimeHandler.timeHandle(time);
    }
}