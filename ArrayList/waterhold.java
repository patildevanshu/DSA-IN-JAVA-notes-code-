package ArrayList;
import java.util.*;
public class waterhold {

    public static int storewater(ArrayList<Integer> height) {
        int maxStorage= 0;

        // brute force O(n^2)
        for (int i = 0; i<height.size(); i++){
            for (int j =i+1 ; j<height.size() ;j++){
                int heigh = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int waterhold = heigh * width;
                maxStorage = Math.max(maxStorage, waterhold);
            }
        }
        System.out.println(maxStorage);
        return maxStorage;
    }

    // 2 pointer approach O(n)
    public static int storewaterOpt(ArrayList<Integer> height) {
        int maxStorage =0;
        int lp = 0;
        int rp = height.size()-1;
        while (lp<rp) {
            // calculate water area
            int heigh = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int waterhold = heigh * width;
            maxStorage = Math.max(maxStorage, waterhold);

            // update pointer
            if (height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
            
        }
        return maxStorage;
    }
    public static void main(String[] args) {
        ArrayList <Integer> height = new ArrayList<>();
        // 186254837
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(height);

       storewater(height);
        System.out.println(storewaterOpt(height));
    }
}
