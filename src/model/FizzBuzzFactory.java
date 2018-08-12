package model;

/**
 * Factory pattern implementation.
 * Factory class generates FizzBuzz processors, hiding creation process details from the class, which uses processors later.
 *
 * Implemented with Singleton pattern to be available everywhere in the app
 */
public class FizzBuzzFactory {

    private static volatile FizzBuzzFactory mThis;

    public static FizzBuzzFactory get()
    {
        FizzBuzzFactory result = mThis;
        if (result == null) {
            synchronized (FizzBuzzFactory.class) {
                result = mThis;
                if (result == null) {
                    result = mThis = new FizzBuzzFactory();
                }
            }
        }
        return result;
    }

    public IFizzBuzz create(String type) {
        if (type != null) {
            if (type.contentEquals("base")) {
                return new FizzBuzz();
            } else if (type.contentEquals("static")) {
                return new FizzBuzzStat();
            } else if (type.contentEquals("direct")) {
                return new FizzBuzzDirect();
            } else if (type.contentEquals("directStatic")) {
                return new FizzBuzzDirectStatic();
            }
        }
        return new FizzBuzz();
    }
}
