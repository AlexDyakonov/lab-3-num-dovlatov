package Enums;

public class Handler {
    public String handle(PLACE place) {
        return PlaceHandler.placeHandle(place);
    }
    public String handle(TIME time) {
        return TimeHandler.timeHandle(time);
    }
    public String handle(SPECIAL special){return SpecialHandler.specialHandle(special);}
    public String handle(STATUS status){return StatusHandler.statusHandle(status);}
}