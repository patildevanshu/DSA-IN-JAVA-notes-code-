package arrays;
public class reversearray {

    public static void reversearrays( int array[]){

        int first=0, last=array.length - 1;

        while (first<last) {
            int swap = array[last];
            array[last]= array[first];
            array[first]= swap ;

            first++;
            last--;
        }
            
    }

    public static void main(String[] args) {

        int array[]= {6,5,6,1,2,7,8,9,4,5} ;

        reversearrays(array);
        
        // for(int i=0; i<array.length ;i++ ){
        //     System.out.print(array[i] + " ");
        // }

        System.out.println((int) Math.sqrt(4));


        
    }
    
}
