package Enums;

public class StatusHandler extends Handler{
    public static String statusHandle(STATUS status){
        String output = new String();
        switch (status){
            case NORMAL ->
                    output += "";
            case INDIFFERENCE ->
                    output += "безразличия";
            case HOPELESSNESS ->
                    output += "безысходности";
            case UNHAPPY ->
                    output += "Несчастный";
            case BROKEN ->
                    output += "бракованный";
        }
        return output;
    }

    @Override
    public String handle(STATUS status) {
        return statusHandle(status);
    }
}
