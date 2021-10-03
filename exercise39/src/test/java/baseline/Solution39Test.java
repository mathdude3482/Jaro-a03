package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution39Test {
    @Test
    void insertEntry(){
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Jacquelyn");
        stringArrayList.add("DBA");
        stringArrayList.add("");
        ArrayList<String> actualList = stringArrayList;
        assertEquals(stringArrayList,actualList);
    }
}