package model;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzFactoryTest {

    @Test
    public void testEmptyClass() {
        IFizzBuzz fb = FizzBuzzFactory.get().create(null);

        Assert.assertEquals(FizzBuzz.class, fb.getClass());
    }

    @Test
    public void testBaseClass() {
        IFizzBuzz fb = FizzBuzzFactory.get().create("base");

        Assert.assertEquals(FizzBuzz.class, fb.getClass());
    }

    @Test
    public void testStatClass() {
        IFizzBuzz fb = FizzBuzzFactory.get().create("static");

        Assert.assertEquals(FizzBuzzStat.class, fb.getClass());
    }

    @Test
    public void testDirectClass() {
        IFizzBuzz fb = FizzBuzzFactory.get().create("direct");

        Assert.assertEquals(FizzBuzzDirect.class, fb.getClass());
    }

    @Test
    public void testDirectStaticClass() {
        IFizzBuzz fb = FizzBuzzFactory.get().create("directStatic");

        Assert.assertEquals(FizzBuzzDirectStatic.class, fb.getClass());
    }

    @Test
    public void testWrongClass() {
        IFizzBuzz fb = FizzBuzzFactory.get().create("stat");

        Assert.assertEquals(FizzBuzz.class, fb.getClass());
    }
}
