package main.java.algorithms;

import main.java.constants.GeneralConstants;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecurringTest {
    @Test
    void shouldGetFirstRecurringForInvalidInput() {
        String result = Recurring.firstRecurring("");
        assertEquals(GeneralConstants.INVALID_INPUT, result);
    }

    @Test
    void shouldGetFirstRecurring() {
        String result = Recurring.firstRecurring("BACDXWAYTRAAHYBZ");
        assertEquals("A", result);
    }

}