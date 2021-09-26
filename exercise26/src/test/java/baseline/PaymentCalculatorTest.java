package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {
    @Test
    void calculate() {
        PaymentCalculator app = new PaymentCalculator();
        double balance = 5000;
        double apr = 12;
        double payment = 100;
        double part1 = (-1.0/30.0) * Math.log(1 + (Math.ceil(balance/payment) *
                (1 - Math.pow(1 + (apr /100.00) / 365.00, 30))));
        double part2 = Math.log(1 + (apr /100.00 / 365.00));
        double expected_result = 70;
        double actual_result = Math.ceil(part1/part2);
        assertEquals(expected_result,actual_result, 0.000001);
    }

}