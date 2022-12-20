package Enums;

public enum SPECIAL {
    NECESSARY ("Необходимо"),
    ASTHEYSAY (", как говорится, "),
    FORTHIS ("Для этого"),
    THEN ("Затем"),
    SOMETHING ("Что-то вроде"),
    ANDSOON ("И так далее"),
    INGENERAL ("В общем"),
    OFC ("разумеется"),
    ABSOLUTELY ("Абсолютно точно"),
    WTF ("Что же произошло?"),
    SOCALLED (", так называемые"),
    LIKE ("что-то вроде");
    private final String special;
    SPECIAL (String special) {
        this.special = special;
    }
    public String getSpecial() {
        return special;
    }

    @Override
    public String toString() {
        return special;
    }
}
