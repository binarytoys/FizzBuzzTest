package model;

/**
 * Base implementation of FizzBuzz
 */
public class FizzBuzz implements IFizzBuzz{
    @Override
    public String make(int val) {
        // check for valid input data range
        if (val < 1 || val > 100) {
            return Integer.toString(val);
        }

        String res = "";
        boolean found = false;

        if (val % 3 == 0) {
            res = "Fizz";
            found = true;
        }
        if (val % 5 == 0) {
            res += "Buzz";
            found = true;
        }
        if (!found) {
            res = Integer.toString(val);
        }
        return res;
    }
}
