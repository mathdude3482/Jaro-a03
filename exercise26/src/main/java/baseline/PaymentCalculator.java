package baseline;
import java.util.Scanner;
public class PaymentCalculator {
    //declare variables needed for the class.
    private static final Scanner in = new Scanner(System.in);
    private double balance;
    private double apr;
    private double payment;
    //take in no parameters.
    public int calculateMonthsUntilPaidOff() {
        //store user input into balance, apr, and payment.
        balance = getInfo("What is your balance?");
        apr = getInfo("What is the APR on the card (as a percent)?");
        payment = getInfo("What is the monthly payment you can make?");
        //return the number of months needed.
        return (int)Math.ceil(calculate());
    }
    //take in 1 parameter: The prompt.
    private double getInfo(String prompt) {
        //print out the prompt.
        System.out.print(prompt);
        //return the user input.
        return in.nextDouble();
    }
    //take in no parameters.
    public double calculate(){
        //calculate the number of months. Round up to the nearest month.
        double part1 = (-1.0/30.0) * Math.log(1 + (Math.ceil(balance/payment) *
                (1 - Math.pow(1 + (apr /100.00) / 365.00, 30))));
        double part2 = Math.log(1 + (apr /100.00 / 365.00));
        return Math.ceil(part1 / part2);
    }
}
