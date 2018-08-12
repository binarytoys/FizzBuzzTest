package model;

/**
 * Implementation of IFizzBuzz with direct comparison to each possible combination and value return
 */
public class FizzBuzzDirect implements IFizzBuzz {

    @Override
    public String make(int val) {
        if (val < 1 || val > 100) {
            return Integer.toString(val);
        }

        if (val % 15 == 0) {
            return "FizzBuzz";
        }
        if (val % 3 == 0) {
            return "Fizz";
        }
        if (val % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(val);
    }
}
