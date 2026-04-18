import java.time.DateTimeException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalendarDayTest {

    @Test
    void shouldReturnCorrectDayForKnownDate() {
        CalendarDay calendario = new CalendarDay();

        assertEquals("WEDNESDAY", calendario.findDay(8, 4, 2026));
    }

    @Test
    void shouldReturnCorrectDayForLeapYearDate() {
        CalendarDay calendario = new CalendarDay();

        assertEquals("THURSDAY", calendario.findDay(29, 2, 2024));
    }

    @Test
    void shouldThrowExceptionForInvalidDate() {
        CalendarDay calendario = new CalendarDay();

        assertThrows(DateTimeException.class, () -> calendario.findDay(31, 2, 2026));
    }
}