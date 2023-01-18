package content;
//предмет может быть описан прилагательным
import enums.STATUS;
import interfaces.Adjectiveable;

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
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (adj != null ? adj.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return this.getClass() == obj.getClass();
    }

}
