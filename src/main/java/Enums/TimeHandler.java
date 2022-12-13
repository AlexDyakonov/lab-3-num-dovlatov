package Enums;

public class TimeHandler extends Handler {
    public static String timeHandle(Time time){
        String output = new String();
        switch (time){
            case EVERYDAY ->
                output += "ежедневно";
            case GRADUALLY ->
                output += "постепенно";
            case MINUTE ->
                output += "Через минуту";
            case MORNING ->
                output += "Наутро";
            case OCCASIONALLY ->
                output +=  "изредка";
            case OVERNIGHT ->
                output += "За ночь";
            case OPPORTUNITY ->
                output += "при каждом удобном случае";
        }
        return output;
    }

    @Override
    public String handle(Time time) {
        return timeHandle(time);
    }
}
