package azim.algorithm;


import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Euclidean {
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
            return new Euclidean(a - div, div).findGCD();
        }
        return new Euclidean(b - div, div).findGCD();
    }
}
