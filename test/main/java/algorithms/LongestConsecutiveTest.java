import main.java.algorithms.LongestConsecutive;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestConsecutiveTest {

    @Test
    void shouldGetLongestConsecutive(){
        Character result = LongestConsecutive.getLongestConsecutive("A");
        Character expected = 'A';
        assertEquals(expected, result);

        Character result2 = LongestConsecutive.getLongestConsecutive("AABBBBCCCXXa");
        Character expected2 = 'B';
        assertEquals(expected2, result2);

        Character result3 = LongestConsecutive.getLongestConsecutive("");
        Character expected3 = null;
        assertEquals(expected3, result3);
    }
}