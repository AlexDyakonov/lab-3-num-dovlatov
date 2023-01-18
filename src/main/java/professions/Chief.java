package professions;

import materials.Materials;

public class Chief extends Profession {

    public Chief() {
        super("вождь");
    }

    public void cover(Materials[] items){
        Head h = new Head();
        System.out.print(h.cover(items) + this.getName() + ".");
    }

    static class Head {
        private final String head = "голову ";

        public Head() {
        }

        public String cover(Materials[] items) {
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
