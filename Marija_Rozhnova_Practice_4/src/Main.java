import java.util.Random;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(1000);

        for (; date.getTime() < 100000000000L; date.setTime(date.getTime() * 10))
            System.out.println(date.toString());

        Random random = new Random(1000);
        for (int i = 0; i < 50; i++)
            System.out.println(random.nextInt(100));

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.get(gc.YEAR) + " " + (gc.get(gc.MONTH) + 1) + " " + gc.get(gc.DAY_OF_MONTH));
        gc.setTimeInMillis(1234567898765L);
        System.out.println(gc.get(gc.YEAR) + " " + (gc.get(gc.MONTH) + 1) + " " + gc.get(gc.DAY_OF_MONTH));
    }
}
/*
public class Date {
    protected final int MILLISECONDS_PER_SECOND = 1000, SECONDS_PER_MINUTE = 60, MINUTES_PER_HOUR = 60, HOURS_PER_DAY = 24;
    protected long elapseTime;

    Date() {
        this.elapseTime = System.currentTimeMillis();
    }

    Date(long elapseTime) {
        this.elapseTime = elapseTime;
    }

    protected boolean isLeapYear(long year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public void setTime(long elapseTime) {
        this.elapseTime = elapseTime;
    }

    public long getTime() {
        return this.elapseTime;
    }

    public String toString() {
        long totalMilliseconds, totalSeconds, currentSecond,
                totalMinutes, currentMinute, totalHours, currentHour, totalDays, totalMonths, totalYears,
        currentDay, currentMonth, currentYear;

        totalMilliseconds = elapseTime;
        totalSeconds = totalMilliseconds / MILLISECONDS_PER_SECOND;
        currentSecond = totalSeconds % SECONDS_PER_MINUTE;
        totalMinutes = totalSeconds / SECONDS_PER_MINUTE;
        currentMinute = totalMinutes % MINUTES_PER_HOUR;
        totalHours = totalMinutes / MINUTES_PER_HOUR;
        currentHour = totalHours % HOURS_PER_DAY;
        totalDays = totalHours / HOURS_PER_DAY;

        currentYear = 1970;
        long daysInYear = (isLeapYear(currentYear)) ? 366 : 365;

        while (totalDays >= daysInYear) {
            totalDays -= daysInYear;
            currentYear++;
            daysInYear = (isLeapYear(currentYear)) ? 366 : 365;
        }

        currentMonth = 0;
        long[] daysInMonth = {31, (isLeapYear(currentYear) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while (totalDays >= daysInMonth[(int)currentMonth]) {
            totalDays -= daysInMonth[(int)currentMonth];
            currentMonth++;
        }

        currentDay = totalDays + 1;

        return "Текущая дата " + currentYear + '.' + (currentMonth + 1) + '.' + currentDay  + " текущее время " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT.";
    }
}

*/