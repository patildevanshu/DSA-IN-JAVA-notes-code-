import java.util.*;

priority queue;

public class basics {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data){
            // Add data to the end of the array
            arr.add(data);

            int x = arr.size()-1; // child idx
            int par = (x-1)/2 ; // parent idx

            // fixing the heap property
            while(arr.get(x) < arr.get(par)){
                // swap the parent and child
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }

        }
        public int peek(){
            return arr.get(0);
        }
        private void heapify(int x){
            int left = 2*x + 1;
            int right = 2*x + 2;
            int minIdx = x;

            if(left < arr.size() && arr.get(left) < arr.get(minIdx)){
                minIdx = left;
            }
            if(right < arr.size() && arr.get(right) < arr.get(minIdx)){
                minIdx = right;
            }
            if(minIdx != x){
                // Swap
                int temp = arr.get(x);
                arr.set(x , minIdx);
                arr.set(minIdx, temp); 

                heapify(minIdx);
            }

        }

        public int remove(){

            // swap the first and last element
            int n = arr.size();
            int temp = arr.get(0);
            arr.set(0, arr.get(n-1));
            arr.remove(n-1);

            // heapify the root
            heapify(0);
            return temp;
        }
    }
}
