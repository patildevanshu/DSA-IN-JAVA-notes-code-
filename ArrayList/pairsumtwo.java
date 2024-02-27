package ArrayList;

import java.util.*;

// find if any pair in sorted & rotated arraylist have target sum

public class pairsumtwo {

    // brute force
    public static boolean pairsumm(ArrayList<Integer> nums, int sum) {

        // brutr force
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) == sum) {
                    return true;
                }
            }
        }
        return false;
    }

    // find if any pairs in sorted &roatated Arraylist is present whoses sum is
    // given
    // based on 2 pointer approach
    public static boolean pairsummOpt(ArrayList<Integer> nums, int sum) {
        int bp = -1;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                bp = i;
                break;
            }
            
        }

        int lp = bp + 1; //smallest
        int rp = bp; //largest
        int n = nums.size();
        while (lp != rp) {
            // case 1
            if (nums.get(lp) + nums.get(rp) == sum) {
                return true;
            }

            // case 2
            if (nums.get(lp) + nums.get(rp) < sum) {
                lp = (lp+1)%n ;
            }
            // case 3
            else {
                rp = (n + rp -1) %n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numm = new ArrayList<>();

        // list is sorted and rotated

        numm.add(11);
        numm.add(15);
        numm.add(6);
        numm.add(8);
        numm.add(9);
        numm.add(10);

        System.out.println(numm);
        System.out.println(pairsummOpt(numm, 160));

    }
}
