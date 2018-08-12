package model;

/**
 * class which join "direct" and "static" features
 */
public class FizzBuzzDirectStatic implements IFizzBuzz {
    private final static String fizz = "Fizz";
    private final static String buzz = "Buzz";
    private final static String fizzBuzz = "FizzBuzz";

    @Override
    public String make(int val) {
        if (val < 1 || val > 100) {
            return Integer.toString(val);
        }

        if (val % 15 == 0) {
            return fizzBuzz;
        }
        if (val % 3 == 0) {
            return fizz;
        }
        if (val % 5 == 0) {
            return buzz;
        }
        return Integer.toString(val);
    }
}
