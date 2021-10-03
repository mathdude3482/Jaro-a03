package baseline;

import java.util.List;

public class Calculate {
    private double sum;

    //hide the implicit public constructor.
    //this class will house all the calculation functions needed.
    public double getAverage(List<Double> numbers) {
        //take in one parameter: the ArrayList of Doubles.
        //return the average of the elements.
        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }
        return sum / numbers.size();
    }

    public double getMinimum(List<Double> numbers) {
        //take in one parameter: the ArrayList of Doubles.
        //return the smallest value in the ArrayList.
        Double minimum = Double.MAX_VALUE;
        //check through each element of the list.
        for (Double i : numbers) {
            //if minimum is greater, change minimum to be i.
            if (minimum > i) {
                minimum = i;
            }
        }
        return minimum;
    }

    public double getMaximum(List<Double> newList) {
        //take in one parameter: the ArrayList of Doubles.
        //return the largest value in the ArrayList.
        Double maximum = Double.MIN_VALUE;
        //check through each element of the list.
        for (Double i : newList) {
            //if maximum is smaller, change maximum to be i.
            if (maximum < i) {
                maximum = i;
            }
        }
        return maximum;
    }

    public double getstDeviation(List<Double> newList, double average) {
        //take in one parameter: the ArrayList of Doubles.
        //return the standard deviation of the elements.
        Double mean = average;
        double total = 0;
        for (int i = 0; i < newList.size(); i++) {
            double val = newList.get(i);
            // Step 2:
            double squrDiffToMean = Math.pow(val - mean, 2);
            // Step 3:
            total += squrDiffToMean;
        }
        double meanOfDiffs = total / (newList.size());
        return Math.sqrt(meanOfDiffs);
    }
}
