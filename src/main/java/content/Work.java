package content;

import enums.STATUS;

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

    public void finalStage(Stage stage) {
        String output = "";
        for (STATUS item : getStatuses()) {
            output += (item + ", ");
        }
        System.out.println(stage.await() + " "+ output + getName());
    }

    @Override
    public String toString() {
        String output = "";
        for (STATUS item : getStatuses()) {
            output += (item + " ");
        }
        return ( "В общем " + getName() + " эта " + output + ".\n");
    }
}
