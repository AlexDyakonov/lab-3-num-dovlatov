package Materials;

public abstract class Materials {
    private final String name;

    public Materials(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
