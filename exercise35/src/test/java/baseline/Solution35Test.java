package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {
    Random rand;
    @BeforeEach
    void createObject(){
       rand = new Random(1);
    }
    @Test
    void chooseIndex() {
        Solution35 myApp = new Solution35(true, "James");
        String name = "James";
        ArrayList<String> names = new ArrayList<>();
        names.add(name);
        int expected = rand.nextInt(1);
        int actual = myApp.chooseIndex(names);
        assertEquals(expected,actual);
    }
}