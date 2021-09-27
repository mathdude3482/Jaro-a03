package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution30Test {

    @Test
    void multiply() {
        Solution30 app = new Solution30();
        int num1 = 5;
        int num2 = 5;
        int expected = 25;
        int actual = app.multiply(num1,num2);
        assertEquals(expected, actual);
    }
}