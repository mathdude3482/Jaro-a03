package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {
    Solution29 app = new Solution29();
    @Test
    void isValid() {
        String testinput = "12";
        String testinput2 = "12avc";
        boolean expected = true;
        boolean expected2 = false;
        boolean actual = app.isValid(testinput);
        boolean actual2 = app.isValid(testinput2);
        assertEquals(expected, actual);
        assertEquals(expected2,actual2);
    }

    @Test
    void convertRate() {
        String testinput = "12";
        double expected = 12;
        double actual = app.convertRate(testinput);
        assertEquals(expected, actual);
    }

    @Test
    void calculate() {
        double testinput = 12;
        double expected = 6;
        double actual = app.calculate(testinput);
        assertEquals(expected, actual);
    }
}