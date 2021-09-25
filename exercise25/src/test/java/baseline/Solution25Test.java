package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    @Test
    void passwordValidator() {
        Solution25 app = new Solution25();
        String passwordValue = "12345";
        String passwordValue2 = "abcdef";
        String passwordValue3 = "adc123xyz";
        String passwordValue4 = "adc123xyz@xor!";
        int actual_result = app.passwordValidator(passwordValue);
        int actual_result2 = app.passwordValidator(passwordValue2);
        int actual_result3 = app.passwordValidator(passwordValue3);
        int actual_result4 = app.passwordValidator(passwordValue4);
        int expected_result = 1;
        int expected_result2 = 2;
        int expected_result3 = 3;
        int expected_result4 = 4;
        assertEquals(expected_result, actual_result);
        assertEquals(expected_result2, actual_result2);
        assertEquals(expected_result3, actual_result3);
        assertEquals(expected_result4, actual_result4);
    }
}