package itp.algorithm.sort;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class QuickSort {
    Integer[] arr;

    public Integer[] sort() {
        int middleElementInd = Math.floorDiv(arr.length, 2);
        if (arr.length <= 1) {
            return arr;
        }
        int middleElement = arr[middleElementInd];
        int leftSize = 0;
        int rightSize = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == middleElementInd) {
                continue;
            }
            if (arr[i] <= middleElement) {
                leftSize++;
            } else {
                rightSize++;
            }
        }
        Integer[] left = new Integer[leftSize];
        Integer[] right = new Integer[rightSize];
        for (int i = 0; i < arr.length; i++) {
            if (i == middleElementInd) {
                continue;
            }
            if (arr[i] <= middleElement) {
                left[--leftSize] = arr[i];
            } else {
                right[--rightSize] = arr[i];
            }
        }

        left = new QuickSort(left).sort();
        right = new QuickSort(right).sort();

        return joinElements(left, new Integer[]{middleElement}, right);
    }

    private Integer[] joinElements(Integer[]... arrs) {
        int size = 0;
        for (Integer[] arr : arrs) {
            size += arr.length;
        }
        Integer[] res = new Integer[size];
        int ind = 0;
        for (Integer[] arr : arrs) {
            for (int i = 0; i < arr.length; i++) {
                res[ind++] = arr[i];
            }
        }
        return res;
    }
}
