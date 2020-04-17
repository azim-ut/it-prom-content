package itp.algorithm.sort;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BubbleSort {
    Integer[] arr;

    public Integer[] sort() {
        boolean found = true;
        while (found){
            found = false;
            for (int i = 0; i < arr.length-1; i++) {
                int current = arr[i];
                int next = arr[i+1];
                if(current>next){
                    found = true;
                    arr[i] = next;
                    arr[i+1] = current;
                }
            }
        }
        return arr;
    }
}
