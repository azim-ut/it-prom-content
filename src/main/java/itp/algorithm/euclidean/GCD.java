package itp.algorithm.euclidean;


import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GCD {
    private final int a, b;

    public int findGCD() {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (a > b) {
            int div = Math.floorDiv(a, b);
            int delta = a - b*div;
            return new GCD(b, delta).findGCD();
        }
        int div = Math.floorDiv(b, a);
        int delta = b - a*div;
        return new GCD(a, delta).findGCD();
    }
}
