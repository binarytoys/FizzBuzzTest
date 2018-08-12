package model;

/**
 * implementation of IFizzBuzz with nested check and static result values
 */
public class FizzBuzzStat implements IFizzBuzz {
    private final static String fizz = "Fizz";
    private final static String buzz = "Buzz";
    private final static String fizzBuzz = "FizzBuzz";

    @Override
    public String make(int val) {
        if (val < 1 || val > 100) {
            return Integer.toString(val);
        }

        if (val % 3 == 0) {
            if (val % 5 == 0) {
                return fizzBuzz;
            }
            return fizz;
        }
        if (val % 5 == 0) {
            return buzz;
        }
        return Integer.toString(val);
    }
}
