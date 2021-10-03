package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {

    @Test
    void removeName() {
        Solution34 myApp = new Solution34();
        List<String> names = new ArrayList<>();
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");
        List<String> actualList = myApp.removeName(names, "John Smith");
        assertEquals(names, actualList);

    }
}