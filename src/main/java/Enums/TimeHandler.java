package Enums;

public class TimeHandler extends Handler {
    public static String timeHandle(TIME time){
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
            case HASTILY ->
                    output += "поспешно";
            case AGAIN ->
                    output += "снова";
            case LATER ->
                    output += "Потом";
        }
        return output;
    }
}
