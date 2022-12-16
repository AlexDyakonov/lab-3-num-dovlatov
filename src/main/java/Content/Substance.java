package Content;
//предмет может быть описан прилагательным
import Enums.STATUS;
import Interfaces.Adjectiveable;

public abstract class Substance {
    private final String name;
    private Adjectiveable adj;
    private STATUS status;

    public Substance(String name) {
        this.name = name;
        this.status = STATUS.NORMAL;
    }

    public Substance(String name, STATUS status) {
        this.name = name;
        this.status = status;
    }

    public Substance(String name, Adjectiveable adj) {
        this.name = name;
        this.adj = adj;
        this.status = STATUS.NORMAL;
    }



    public String getName() {
        return name;
    }

    public Adjectiveable getAdj() {
        return adj;
    }
    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }
    @Override
    public boolean equals(Object obj) {
        return this.getClass() == obj.getClass();
    }

}
