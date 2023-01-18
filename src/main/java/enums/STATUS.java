package enums;

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
    UNPUBLISHED(" не опубликован"),
    PUBLISHED("опубликован"),
    LITTERED("с лишним"),
    UNLITTERED("убрать лишнее"),
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
