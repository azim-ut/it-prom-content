package azim.algorithm.euclidean;


import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class GCDList {
    private List<Integer> list;

    public int findGCD() {
        if (list.size() == 0) {
            return 1;
        }
        int res = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            res = new GCD(list.get(i), res).findGCD();
        }
        return res;
    }
}
