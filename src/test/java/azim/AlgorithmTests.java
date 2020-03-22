package azim;

import azim.algorithm.Euclidean;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AlgorithmTests {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void euclideanTest() {
        Euclidean engine = new Euclidean(375, 192);
        Assert.assertEquals(3, engine.findGCD());
    }
}
