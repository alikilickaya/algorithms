import main.java.algorithms.Recurring;
import main.java.constants.GeneralConstants;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecurringTest {
    @Test
    void shouldGetFirstRecurringForInvalidInput() {
        String result = Recurring.getFirstRecurring("");
        assertEquals(GeneralConstants.INVALID_INPUT, result);

        String result2 = Recurring.getFirstRecurring(null);
        assertEquals(GeneralConstants.INVALID_INPUT, result2);
    }

    @Test
    void shouldGetFirstRecurring() {
        String result = Recurring.getFirstRecurring("BACDXWAYTRAAHYBZ");
        assertEquals("A", result);

        String result2 = Recurring.getFirstRecurring("A");
        assertEquals("", result2);
    }

    @Test
    void shouldGetAllRecurringForInvalidInput() {
        String result = Recurring.getAllRecurrings("");
        assertEquals(GeneralConstants.INVALID_INPUT, result);

        String result2 = Recurring.getAllRecurrings(null);
        assertEquals(GeneralConstants.INVALID_INPUT, result2);
    }

    @Test
    void shouldGetAllRecurrings() {
        String result = Recurring.getAllRecurrings("KKABCABCABCXYZX");
        assertEquals("KABCX", result);

        String result2 = Recurring.getAllRecurrings("KKKKKABCABCABCXYZX");
        assertEquals("KABCX", result);

        String result3 = Recurring.getAllRecurrings("A");
        assertEquals("", result3);
    }

}