package azim;

import azim.algorithm.euclidean.GCD;
import azim.algorithm.euclidean.GCD3;
import azim.algorithm.euclidean.GCDList;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AlgorithmTests {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void gcd2Test() {
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
