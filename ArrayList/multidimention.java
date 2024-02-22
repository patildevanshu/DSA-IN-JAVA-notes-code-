package ArrayList;
import java.util.*;
public class multidimention {
    public static void main(String[] args) {
        
        ArrayList <ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();
        ArrayList <Integer> list3 = new ArrayList<>();

        list.add(1); list.add(2); list.add(3);
        list2.add(2); list2.add(4); list2.add(6);
        list3.add(3); list3.add(6); list3.add(9);

        mainlist.add(list);
        mainlist.add(list2);
        mainlist.add(list3);
        System.out.println(mainlist);

        // printing 2d arraylist

        for (int i=0 ; i<mainlist.size(); i++){
            for (int j=0 ; j<mainlist.get(i).size() ; j++){
                System.out.print(mainlist.get(i).get(j) + " ");
            }
            System.out.println();
        }

        // 2nd way
        for (int i=0 ; i<mainlist.size(); i++){
            ArrayList <Integer> curr = mainlist.get(i); 
            for (int j =0 ; j< curr.size() ; j++){
                System.out.print(curr.get(j) + " ");
            }
            System.out.println();
        }

    }
}
