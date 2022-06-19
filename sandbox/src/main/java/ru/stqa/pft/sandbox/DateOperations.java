package ru.stqa.pft.sandbox;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateOperations {

    private static long hoursPassed(long h) {
        return h/1000/60/60;
    }

    private static long daysPassed(long d) {
        return d/1000/60/60/24;
    }

    public static void main(String[] args) {

        Calendar calendar1 = new GregorianCalendar(2021, Calendar.APRIL, 01, 10, 12);
        Calendar calendar2 = new GregorianCalendar(2022, Calendar.MAY, 01, 10, 12);
        Date date2 = calendar1.getTime(); //получение данных в миллисекундах с 01.01.1970 до указанной даты
        Date date3 = calendar2.getTime(); //получение данных в миллисекундах с 01.01.1970 до указанной даты

        long millisDates = date3.getTime() - date2.getTime();
        System.out.println("С даты " + calendar1.getTime() + " и " + calendar2.getTime() + " прошло часов: " + hoursPassed(millisDates) + ", дней: " + daysPassed(millisDates));

        Date date = new Date();
        long millisecs = date.getTime() - date3.getTime();
        System.out.println("С даты " + calendar2.getTime() + " до сегодняшнего дня " + "прошло часов: " + hoursPassed(millisecs) + ", дней: " + daysPassed(millisecs));
    }
}
