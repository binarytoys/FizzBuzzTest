package model;

/**
 * IFizzBuzz interface for family of processing classes. We can use abstract class instead of interface, but interface
 * more flexible
 */
public interface IFizzBuzz {
    /**
     * make "Fizz", "Buzz", "FizzBuzz" or plain number string from input number.
     * For multiples of three prints “Fizz” instead of the number and for the multiples of five prints “Buzz”.
     * For numbers which are multiples of both three and five prints “FizzBuzz” in range from 1 to 100.
     * @param val integer input number value
     * @return string
     */
    String make(int val);
}
