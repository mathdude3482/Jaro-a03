package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {
    @Test
    public void test_isAnagram(){
        Solution24 app = new Solution24();
        String word1 = "note";
        String word2 = "tone";
        boolean actual_result = app.isAnagram(word1, word2);
        boolean expected_result = true;
        assertEquals(expected_result, actual_result);
    }
}