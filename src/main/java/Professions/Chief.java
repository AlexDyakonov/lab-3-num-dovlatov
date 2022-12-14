package Professions;

import Items.Item;

public class Chief extends Profession {

    public Chief() {
        super("вождь");
    }

    public String cover(Item[] items){
        Head h = new Head();
        return (h.cover(items) + this.getName());
    }

    static class Head {
        private final String head = "голову ";

        public Head() {
        }

        public String cover(Item[] items) {
            String output = new String();
            if (items.length == 1) {
                output += ("Одна ");
            } else {
                output = "";
            }
            return (output + "покрывала " + this.head);
        }
    }
}
