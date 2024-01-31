package divideconquor;

public class basics {
    
    public static void printArr(int arr[]){
        for (int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void mergesort(int str[] , int si , int ei){
        // base case
        if (si>=ei){
            return;
        }
        // kaam
        int mid = si + (ei - si) / 2;
        mergesort(str, si, mid); //left part
        mergesort(str, mid+1, ei); //right part
        merge(str, si, mid, ei);
    }

    public static void merge(int arr[], int si , int mid , int ei){
        int temp[] = new int[ei-si+1];
        int i = si; // itterator of left part
        int j = mid + 1; // itterator for right part
        int k = 0; // itterator for temp arraay

        while (i<=mid && j<=ei) {
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++; 
                k++;
            }
            else{
                temp[k] = arr[j];
                j++;
                k++;
            }
            
        }
        // left part
        while (i<=mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // right part 
        while (j <= ei) {
            temp[k] = arr[j];
            i++; 
            k++;
        }

        // copying data from temp to orginal arr
        for (k = 0 , i = si; k<temp.length ; k++ , i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,5,6,2,3,7,9,4,6,2};
        mergesort(arr, 0, arr.length-1);
        printArr(arr);
    }
} 
 