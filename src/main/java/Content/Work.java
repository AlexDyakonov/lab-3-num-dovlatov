package Content;

import Enums.STATUS;

import java.util.Arrays;

public class Work extends Substance{
    private STATUS[] statuses;
    public Work( STATUS[] status) {
        super("работа");
        this.statuses = status;
    }

    public STATUS[] getStatuses() {
        return statuses;
    }

    public void setStatuses(STATUS[] statuses) {
        this.statuses = statuses;
    }

    public String finalStage(Stage stage) {
        String output = "";
        for (STATUS item : getStatuses()) {
            output += (item + ", ");
        }
        return (stage.await() + " "+ output + getName());
    }

    @Override
    public String toString() {
        String output = "";
        for (STATUS item : getStatuses()) {
            output += (item + " ");
        }
        return ( " " + getName() + " эта " + output + ".\n");
    }
}
