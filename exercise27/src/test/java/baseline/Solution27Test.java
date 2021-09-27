package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {

    @Test
    void validateInput() {
        Solution27 app = new Solution27();
        String input1 = "James";
        String input2 = "Jaro";
        String input3 = "32225";
        String input4 = "ID-0122";
        String expected_value = "\nThere were no errors found.";
        String actual_value = app.validateInput(input1,input2,input3,input4);
        assertEquals(expected_value, actual_value);
    }
}