package azim.algorithm.euclidean;


import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GCD3 {
    private final int a, b, c;

    public int findGCD(){
        int res = new GCD(a,b).findGCD();
        return new GCD(res, c).findGCD();
    }
}
