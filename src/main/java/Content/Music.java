package Content;

public class Music extends Substance{
    public Music() {
        super("Музыка");
    }

    public String faded(){
        return (this.getName() + " стихла.");
    }
}
