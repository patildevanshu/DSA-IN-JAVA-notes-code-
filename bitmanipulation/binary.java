package bitmanipulation;

public class binary {
    
    public static void oddoreven( int n){
        int bitmask = 1;
        if (( n & bitmask) == 0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }

    public static int getithterm( int n , int m){
        int bitmask = 1<< m;

        if (( n & bitmask)==0){
            return 0;
        }
        else {
            return 1;
        }
    }

    public static int setithterm( int n , int m){
        int bitmask = 1<< m;

       n = (n | bitmask);
       return n;
    }
    public static int clearithterm( int n , int m){
        int bitmask = ~(1<<m);

        return n & bitmask;
    }

    public static int updateithterm( int n , int m , int newbit){
        // if (newbit == 0){
        //    return clearithterm(n, m);
        // }
        // else{
        //    return setithterm(n, m);
        // }

        n = clearithterm(n, m);
        int bitmask = (newbit << m);

        return n | bitmask;
    }
    public static void main(String[] args) {
        oddoreven(6);
        System.out.println(updateithterm(10, 2 , 1));
    }
    
}
