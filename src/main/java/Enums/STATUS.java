package Enums;

public enum STATUS {
    NORMAL (""),
    INDIFFERENCE ("безразличия"),
    HOPELESSNESS ("безысходности"),
    UNHAPPY ("Несчастный"),
    BROKEN ("бракованный"),
    FUTURE ("будущего"),
    FINAL ("завершающий"),
    ACCURACY ("филигранная"),
    RESPONSIBLE ("ответственная"),
    FADED(" стихла"),
    DIFFERENT ("иной");
    private final String status;
    STATUS (String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
    @Override
    public String toString() {
        return status;
    }
}
