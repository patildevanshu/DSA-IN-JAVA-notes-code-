package ArrayList;
import java.util.*;
public class pairsum {
// find if any  pairs in sorted Arraylist is present whoses sum is given
    public static boolean pairsumm(ArrayList <Integer> nums , int sum){

        // brutr force
        for (int i =0; i<nums.size(); i++){
            for (int j =i+1 ; j< nums.size(); j++){
                if(nums.get(i)+nums.get(j)==sum){
                    return true;
                }
            }
        }
        return false;
    }
// find if any  pairs in sorted Arraylist is present whoses sum is given
    public static boolean pairsummOpt(ArrayList <Integer> nums , int sum){
        int 
        return false;
    }
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();
        for (int i = 0 ; i<7 ;i++){
            nums.add(i);
        }
        System.out.println(nums);

        System.out.println(pairsumm(nums, 10));
    }
}
