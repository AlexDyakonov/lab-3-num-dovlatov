package Content;

import Interfaces.Adjectiveable;

public abstract class Substance {
    private String name;
    private Adjectiveable adj;

    public Substance(String name) {
        this.name = name;
    }

    public Substance(String name, Adjectiveable adj) {
        this.name = name;
        this.adj = adj;
    }

    public String getName() {
        return name;
    }

    public Adjectiveable getAdj() {
        return adj;
    }
}
