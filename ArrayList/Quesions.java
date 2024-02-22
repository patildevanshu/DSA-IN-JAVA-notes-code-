package ArrayList;

import java.util.*;

public class Quesions {

    public static void swap(ArrayList<Integer> list , int idx1 , int idx2){
        // swap 2 numbers
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i+5);
        }

        System.out.println(list);

        // print reverse of an arraylist
        for(int i = list.size()-1; i>=0 ; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // find key

        int key = 5;
        for (int i = 0 ; i<list.size();i++){
            if (list.get(i)==key){
                System.out.println("key is present at index " + i);
                break;
            }
        }

        // find maximum
        int max = Integer.MIN_VALUE;
        for (int i =0 ; i<list.size() ; i++){
            // if(list.get(i) > max){
            //     max = list.get(i);
            // }
            // or we can also write

            max = Math.max(max, list.get(i));
        }
        System.out.println(max);

        // swap 2 numbers
        int idx1 = 1;
        int idx2 = 3;

        swap(list, idx1, idx2);
        System.out.println(list);

        // sort
        // ascending order
        Collections.sort(list);
        System.out.println(list);

        // decending order
        Collections.sort(list , Collections.reverseOrder());
        System.out.println(list);
    }
}
