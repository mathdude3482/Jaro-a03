package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test {
    @Test
    void filterEvenNumbers() {
        Solution38 app = new Solution38();
        List<Integer> testData = new ArrayList<>();
        testData.add(2);
        testData.add(4);
        List<Integer> actualList = app.filterEvenNumbers(testData);
        assertEquals(testData, actualList);
    }
    @Test
    void isEven() {
        Solution38 app = new Solution38();
        int num = 2;
        boolean expected = true;
        boolean actual = app.isEven(num);
        assertEquals(expected, actual);
    }
    @Test
    void isEven2(){
        Solution38 app = new Solution38();
        int num = 5;
        boolean expected = false;
        boolean actual = app.isEven(num);
        assertEquals(expected, actual);
    }
}