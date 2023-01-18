package enums;

public enum INSTRUMENTS {
    Puncher("перфоратор"),
    dottedLineMachine("пунктир-машины"),
    Mallet ("test"),
    Scarpel ("test"),
    Hammer ("test"),
    Chisel ("test");
    private final String instrument;
    INSTRUMENTS (String instrument) {
        this.instrument = instrument;
    }
    public String getInstrument() {
        return instrument;
    }
    @Override
    public String toString() {
        return instrument;
    }
}
