package ru.stqa.pft.sandbox;

public class FromDaysToSeconds {

    public int days;

    public FromDaysToSeconds(int days) {
        this.days = days;
    }

    public int getSecondsFromDays() {
        return this.days * 24 * 60 * 60;
    }
}
