package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

    @Test
    void getSum() {
        Solution28 app = new Solution28();
      int[] num = new int[5];
      num[0] = 1;
      num[1] = 2;
      num[2] = 3;
      num[3] = 4;
      num[4] = 5;
        int sum = app.getSum(num);
        int expected_result = 15;
        int actual_result = sum;
        assertEquals(expected_result, actual_result);
    }
}