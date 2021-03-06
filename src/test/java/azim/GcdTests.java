package itp;

import itp.algorithm.euclidean.GCD;
import itp.algorithm.euclidean.GCD3;
import itp.algorithm.euclidean.GCDList;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class GcdTests {
    @Test
    public void gcdTest() {
        GCD engine = new GCD(375, 192);
        Assert.assertEquals(3, engine.findGCD());
    }

    @Test
    public void gcd3Test() {
        GCD3 engine = new GCD3(50, 25, 200);
        Assert.assertEquals(25, engine.findGCD());

        engine = new GCD3(50, 200, 25);
        Assert.assertEquals(25, engine.findGCD());

        engine = new GCD3(200, 50, 25);
        Assert.assertEquals(25, engine.findGCD());
    }

    @Test
    public void gcdListTest() {
        GCDList engine = new GCDList(Arrays.asList(50, 15, 200, 25));
        Assert.assertEquals(5, engine.findGCD());
    }
}
