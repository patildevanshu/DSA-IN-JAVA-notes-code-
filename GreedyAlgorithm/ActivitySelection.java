package GreedyAlgorithm;

import java.util.*;

public class ActivitySelection {
    // You are given n activities with their start and end times. Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time. Activities are sorted according to end time.

    // start = [10, 12, 201]
    // end = [20, 25, 30]
    // ans = 2 (A0 & A2)


    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9}; 

        int activities[][] = new int[start.length][3];
        for (int i = 0 ; i<start.length;i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        // lembda function -> shortform
        Arrays.sort(activities , Comparator.comparingDouble(o -> o[2]));

        int maxActi = 0;
        ArrayList<Integer> anss = new ArrayList<>();

        // first activity
        maxActi =1;
        anss.add(activities[0][0]);
        int lastEndd = activities[0][2];

        for(int i =1; i<end.length ; i++){
            if (activities[i][1] >= lastEndd) {
                // activity select
                maxActi++;
                anss.add(activities[i][0]);
                lastEndd = activities[i][2];
            }
        }



        // end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // first activity
        maxAct =1;
        ans.add(0);
        int lastEnd = end[0];

        for(int i =1; i<end.length ; i++){
            if (start[i] >= lastEnd) {
                // activity select
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("maximum activities are = "  + maxAct);
        for(int i=0 ; i<ans.size();i++){
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------");

        // activities sorted menually
        System.out.println("maximum activities are = "  + maxActi);
        for(int i=0 ; i<anss.size();i++){
            System.out.print("A" + anss.get(i) + " ");
        }
        System.out.println();


    }


}
