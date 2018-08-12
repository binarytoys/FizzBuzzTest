package model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FizzBussTest {

    @Parameterized.Parameters
    public static IFizzBuzz[] data() {
        return new IFizzBuzz[] { new FizzBuzz(), new FizzBuzzStat(), new FizzBuzzDirect(), new FizzBuzzDirectStatic() };
    }

    @Parameterized.Parameter
    public IFizzBuzz fizzBuzz;

    @Test
    public void testToNumbers() {
        IFizzBuzz fb = fizzBuzz; //new FizzBuzz();

        Assert.assertEquals("1", fb.make(1));
        Assert.assertEquals("11", fb.make(11));
        Assert.assertEquals("83", fb.make(83));
        Assert.assertNotEquals("3", fb.make(3));
        Assert.assertNotEquals("10", fb.make(10));
    }

    @Test
    public void testToFizz() {
        IFizzBuzz fb = fizzBuzz;

        Assert.assertEquals("Fizz", fb.make(3));
        Assert.assertEquals("Fizz", fb.make(9));
        Assert.assertEquals("Fizz", fb.make(24));
    }

    @Test
    public void testToBuzz() {
        IFizzBuzz fb = fizzBuzz;

        Assert.assertEquals("Buzz", fb.make(5));
        Assert.assertEquals("Buzz", fb.make(10));
        Assert.assertEquals("Buzz", fb.make(25));
    }

    @Test
    public void testToFizzBuzz() {
        IFizzBuzz fb = fizzBuzz;

        Assert.assertEquals("FizzBuzz", fb.make(15));
        Assert.assertEquals("FizzBuzz", fb.make(30));
        Assert.assertEquals("FizzBuzz", fb.make(45));
    }

    @Test
    public void testToNegatives() {
        IFizzBuzz fb = fizzBuzz; //new FizzBuzz();

        Assert.assertEquals("0", fb.make(0));
        Assert.assertEquals("-3", fb.make(-3));
        Assert.assertEquals("-5", fb.make(-5));
        Assert.assertEquals("-15", fb.make(-15));
    }

    @Test
    public void testToHundreds() {
        IFizzBuzz fb = fizzBuzz; //new FizzBuzz();

        Assert.assertEquals("105", fb.make(105));
        Assert.assertEquals("102", fb.make(102));
        Assert.assertEquals("110", fb.make(110));
    }


}
