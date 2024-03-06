package GreedyAlgorithm;

import java.util.Arrays;

public class absoluteDifference { // O(nLogn)
    // Min Absolute Difference Pairs
    // Given two arrays A and B of equal length n. Pair each element of array A to an element in array B, such that sum S of absolute differences of all the pairs is minimum.
    // A= [1, 2, 3]        Case 1: |1 - 2| + |2 - 1| + |3 - 3| = 1 + 1 + 0 = 2
    // B= [2, 1, 3]        case 2: |1 - 3| + |2 - 1| + |3 - 2| = 2 + 1 + 1 = 4
    // ans = 0             case 3: |1 - 1| + |2 - 2| + |3 - 3| = 0 + 0 + 0 = 0

    public static void main(String[] args) {
        
        int A[] = {1,2,3};
        int B[] = {2,1,3};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff =0;
        
        for (int i = 0; i<A.length ; i++){
            minDiff += Math.abs(A[i]-B[i]); 
        }

        System.out.println("sum of min absolute diff of pairs = " + minDiff);

    }

}
