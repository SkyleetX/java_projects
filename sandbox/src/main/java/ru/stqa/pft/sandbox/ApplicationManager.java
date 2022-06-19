package ru.stqa.pft.sandbox;

public class ApplicationManager {

    private SecondManager sm;
    public int id;
    public String name;
    public String surname;

    public int getId() {
        return id;
    }

    public ApplicationManager withId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ApplicationManager withName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public ApplicationManager withSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String[] asMassive() {
        String[] fio = {String.valueOf(id), name, surname};
        return fio;
    }

    public String fullText() {
        return "#" + id + " " + name + " " + surname;
    }


    public SecondManager sm() {
        if (sm == null) {
            sm = new SecondManager(this);
        }
        return sm;
    }
}
