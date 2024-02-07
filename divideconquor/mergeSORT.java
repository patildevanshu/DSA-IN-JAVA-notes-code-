package divideconquor;
//  getting error while executing this code
public class mergeSORT {
    
    public static void printArr(int arr[]){
        for (int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void mergesort(int arr[] , int si , int ei){
        // base case
        if (si>=ei){
            return;
        }
        // kaam
        int mid = si + (ei-si)/2;     
        mergesort(arr, si, mid); //left part
        mergesort(arr, mid+1, ei); //right part
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si , int mid , int ei){
        int temp[] = new int[ei-si+1];
        int i = si; // itterator of left part
        int j = mid+1; // itterator for right part
        int k =0; // itterator for temp arraay

        while (i<=mid && j<=ei) {
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
                // i++; 
                
            }
            else{
                temp[k++] = arr[j++];
                // j++;
                
            }
            // k++;
            
        }
        // left part
        while (i<=mid) {
            temp[k++] = arr[i++];
            // i++;
            // k++;
        }

        // right part 
        while (j <= ei) {
            temp[k++] = arr[j++];
            // i++; 
            // k++;
        }

        // copying data from temp to orginal arr
        for (int n = 0 , m = si; n<temp.length ; n++ , m++){
            arr[m] = temp[n];
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,5,6,2,3,9};
        mergesort(arr,0,arr.length-1);
        printArr(arr);
    }
} 
 