package materials;

public class Cloth extends Materials {
    private String color;

    public Cloth() {
        super("ткань");
        this.color = "";
    }

    public Cloth(String color){
        super("ткань");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getName() {
        return  getColor() + super.getName() ;
    }
}
