package People;

import Professions.Profession;

public abstract class Person {
    private final String firstName;
    private final String secondName;
    private Profession[] professions;
    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.professions = null;
    }

    public Person(String firstName, String secondName, Profession[] professions) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.professions = professions;
    }

    public Person(String firstName) {
        this.firstName = firstName;
        this.secondName = null;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Profession[] getProfessions() {
        return professions;
    }

    public void setProfessions(Profession[] professions) {
        this.professions = professions;
    }

    public String getFirstSecondName(){
        return (firstName + " " + secondName);
    }
}
