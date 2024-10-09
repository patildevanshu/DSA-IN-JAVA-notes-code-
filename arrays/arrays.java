package arrays;



public class arrays {
       
    

    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for (int i=0 ; i<= numbers.length ; i++){
            if (largest < numbers[i]){
                largest = numbers[i];
            }
        }
        System.out.println(largest);
        return largest ;
    }

    public static int linearsearch(int numbers[], int key){
        for (int i = 0; i <= numbers.length ; i++){
            if (numbers[i]== key){
               return i;       
            }
        } 

        return 0 ;
    }
    public static void main(String[] args) {
        int number[] = {2,64,5,6,0,8,7};
        //int key = 8 ;

        // for (int i=0; i<=numbers.length; i++){
        //     System.err.println(numbers[i]);
        // }
        // int index = linearsearch(numbers, key);
        // System.out.println(index);
           // syso

        int largest = getlargest(number);
        System.out.println(largest);
    }



}
