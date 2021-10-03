package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    @Test
    void getAverage() {
        Calculate myData = new Calculate();
        List<Double> testData = new ArrayList<>();
        testData.add(100.0);
        testData.add(300.0);
        testData.add(1000.0);
        testData.add(200.0);
        double expected = 400.0;
        double actual = myData.getAverage(testData);
        assertEquals(expected, actual, 0.00001);
    }

    @Test
    void getMinimum() {
        Calculate myData = new Calculate();
        List<Double> testData = new ArrayList<>();
        testData.add(100.0);
        testData.add(300.0);
        testData.add(1000.0);
        testData.add(200.0);
        double expected = 100;
        double actual = myData.getMinimum(testData);
        assertEquals(expected, actual, 0.00001);
    }

    @Test
    void getMaximum() {
        Calculate myData = new Calculate();
        List<Double> testData = new ArrayList<>();
        testData.add(100.0);
        testData.add(300.0);
        testData.add(1000.0);
        testData.add(200.0);
        double expected = 1000.0;
        double actual = myData.getMaximum(testData);
        assertEquals(expected, actual, 0.00001);
    }

    @Test
    void getstDeviation() {
        Calculate myData = new Calculate();
        List<Double> testData = new ArrayList<>();
        testData.add(100.0);
        testData.add(300.0);
        testData.add(1000.0);
        testData.add(200.0);
        double expected = 353.55;
        double actual = (myData.getstDeviation(testData, myData.getAverage(testData)));
        assertEquals(expected, actual, 0.01);
    }
}