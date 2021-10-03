package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateInputTest {
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
}