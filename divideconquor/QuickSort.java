package divideconquor;

public class QuickSort {
    public static void printArr(int arr[]){
        for (int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si , int ei){
        // base case 
        if(si>=ei){
            return;
        }
        // last elemant
        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx-1); // left
        quickSort(arr, pidx+1, ei); // right
    }

    public static int partition(int arr[], int si , int ei){
        int pivit = arr[ei];
        int i = si -1; // to make space for smaller than element

        for (int j =si; j<ei ; j++){
            if (arr[j] <= pivit){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i]= temp;
            }
        }
        i++;
        int temp = pivit;
        arr[ei] = arr[i];
        arr[i]= temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,0,10,12,19,99,8,2,5};
        quickSort(arr, 0, arr.length -1);
        printArr(arr);
    }
}
