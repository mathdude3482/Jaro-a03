package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {
Solution31 app = new Solution31();
    @Test
    void validInput() {
        String input1 = "1abc";
        String input2 = "12";
        boolean expected_1 = false;
        boolean actual_1 = app.validInput(input1);
        boolean expected_2 = true;
        boolean actual_2 = app.validInput(input2);
        assertEquals(expected_1,actual_1);
        assertEquals(expected_2, actual_2);
    }

    @Test
    void getheartRate() {
        int age = 22;
        int rest = 65;
        int intensity = 95;
        double expected_value = 191;
        double actual_value = app.getheartRate(age, rest, intensity);
        assertEquals(expected_value,actual_value);
    }
}