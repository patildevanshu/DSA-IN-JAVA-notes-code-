package backtracking;

public class arrays {
    public static void changearr(int arr[], int i , int val){  
        // base case
            if(i==arr.length){
                printarr(arr);
                return;
            }

        // recurssion
        arr[i] = val;
        changearr(arr, i+1, val+1); // fnx call step
        arr[i] = arr[i] - 2; //backtracking step

    }
    public static void printarr(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void findsubset(String str, String ans , int i){
// time coplex = O(n * 2^n)
        // base case
        if (i == str.length()){
            if (ans.length()== 0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        // yes choice
        findsubset(str, ans + str.charAt(i), i+1);
        // no choice
        findsubset(str, ans, i+1);
    }

    public static void main(String[] args) {
        // int arr[] = new int[5];
        // changearr(arr, 0, 1);
        // printarr(arr);
        String str = "abc";
        findsubset(str, "", 0);
    }
}
