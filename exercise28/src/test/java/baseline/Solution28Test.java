package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

    @Test
    void getSum() {
        Solution28 app = new Solution28();
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        int sum = app.getSum(num1, num2, num3, num4, num5);
        int expected_result = 15;
        int actual_result = sum;
        assertEquals(expected_result, actual_result);
    }
}