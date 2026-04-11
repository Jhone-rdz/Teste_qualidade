import java.time.LocalDate;

public class CalendarDay
{
    public String findDay(int day, int month, int year)
    {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString();
    }


@Override
    public String toString() {
        return "CalendarDay{}";
    }  
}