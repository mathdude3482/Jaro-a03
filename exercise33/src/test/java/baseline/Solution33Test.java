package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {
Random rand = new Random();
@BeforeEach
    void createObject(){
    rand = new Random(1);
}
    @Test
    void getRand() {
        Solution33 app = new Solution33(true);
        int expected = rand.nextInt(4);
        int actual = app.getRand();
        assertEquals(expected, actual);
    }
}