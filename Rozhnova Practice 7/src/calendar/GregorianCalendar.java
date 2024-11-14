package calendar;

public class GregorianCalendar {
    public static void main(String[] args) {
        java.util.GregorianCalendar calendar = new java.util.GregorianCalendar();

        int currentYear = calendar.get(java.util.Calendar.YEAR);
        int currentMonth = calendar.get(java.util.Calendar.MONTH) + 1;
        int currentDay = calendar.get(java.util.Calendar.DAY_OF_MONTH);

        System.out.println("Текущий год: " + currentYear);
        System.out.println("Текущий месяц: " + currentMonth);
        System.out.println("Сегодняшний день: " + currentDay);

        calendar.setTimeInMillis(1234567898765L);
        int specifiedYear = calendar.get(java.util.Calendar.YEAR);
        int specifiedMonth = calendar.get(java.util.Calendar.MONTH) + 1;
        int specifiedDay = calendar.get(java.util.Calendar.DAY_OF_MONTH);

        System.out.println("Год для 1234567898765L: " + specifiedYear);
        System.out.println("Месяц для 1234567898765L: " + specifiedMonth);
        System.out.println("День для 1234567898765L: " + specifiedDay);
    }
}