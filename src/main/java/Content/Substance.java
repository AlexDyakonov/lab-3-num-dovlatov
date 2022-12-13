package Content;

public abstract class Substance {
    private String name;

    public Substance(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
