package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class maxLengthChainOfPair {

    // Max Length Chain of Pairs
    // You are given n pairs of numbers. In every pair, the first number is always
    // smaller than the second number. A pair (c, d) can come after pair (a, b) if b
    // < c. Find the longest chain which can be formed from a given set of pairs.

    // pairs = (5, 24) ,(39, 60),(5, 28),(27, 40),(50, 90)
    // ans = 3

    public static void main(String[] args) {
        // O(nLogn)
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1;
        int pairEnd = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > pairEnd) {
                chainLen++;
                pairEnd = pairs[i][1];
            }
        }

        System.out.println("max length of chain pair = " + chainLen);

    }
}
