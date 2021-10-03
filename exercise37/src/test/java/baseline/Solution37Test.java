package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class Solution37Test {
    Random rand = new Random();
    @BeforeEach
        void createObject(){
        rand = new Random(1);
    }
    @Test
    void getDigit() {
        Solution37 myApp = new Solution37(true);
        char expected = (char) (rand.nextInt((57 - 48) + 1) + 48);
        char actual = myApp.getDigit();
        assertEquals(expected, actual);
    }

    @Test
    void chooseSpecial() {
        Solution37 myApp = new Solution37(true);
        List<Character> specialSymbol = myApp.getSymbol();
        char expected = specialSymbol.get(rand.nextInt(specialSymbol.size()));
        char actual = myApp.chooseSpecial();
        assertEquals(expected, actual);
    }

    @Test
    void chooselowerAlphabet() {
        Solution37 myApp = new Solution37(true);
        char expected = (char) ((rand.nextInt(90 - 65) + 1) + 65);
        char actual = myApp.chooselowerAlphabet();
        assertEquals(expected, actual);
    }

    @Test
    void chooseUpperAlphabet() {
        Solution37 myApp = new Solution37(true);
        char expected = (char) ((rand.nextInt(122 - 97) + 1) + 97);
        char actual = myApp.chooseUpperAlphabet();
        assertEquals(expected, actual);
    }
}