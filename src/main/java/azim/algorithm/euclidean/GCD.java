package azim.algorithm.euclidean;


import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GCD {
    private final int a, b;

    public int findGCD(){
        if(a == 0){
            return b;
        }
        if(b == 0){
            return a;
        }

        int div = Math.abs(a - b);
        if(a > b){
            return new GCD(a - div, div).findGCD();
        }
        return new GCD(b - div, div).findGCD();
    }
}
