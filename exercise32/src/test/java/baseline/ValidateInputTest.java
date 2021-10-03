package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ValidateInputTest {
    Random rand;
    @BeforeEach
    void createObject(){
        rand = new Random(1);
    }
    @Test
    void validInput() {
        ValidateInput myInput = new ValidateInput();
        String difficulty = "1";
        boolean expected = true;
        boolean actual = myInput.validInput(difficulty);
        assertEquals(expected, actual);
    }

    @Test
    void invalidAnswer() {
        ValidateInput myInput2 = new ValidateInput();
        String answer = "ABC#";
        boolean expected2 = true;
        boolean actual2 = myInput2.invalidAnswer(answer);
        assertEquals(expected2, actual2);
    }

    @Test
    void checkRandom(){
        PlayGame myGame = new PlayGame(true);
        int expectedValue = rand.nextInt(10) + 1;
        int actualvalue = myGame.getComputeranswer();
        assertEquals(expectedValue, actualvalue);
    }
    @Test
    void checkRandom2(){
        PlayGame myGame = new PlayGame(true);
        int expectedValue = rand.nextInt(100) + 1;
        int actualvalue = myGame.getComputerAnswer2();
        assertEquals(expectedValue, actualvalue);
    }
    @Test
    void checkRandom3(){
        PlayGame myGame = new PlayGame(true);
        int expectedValue = rand.nextInt(1000) + 1;
        int actualvalue = myGame.getComputerAnswer3();
        assertEquals(expectedValue, actualvalue);
    }
}