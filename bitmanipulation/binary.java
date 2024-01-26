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

    public static int cleariterms( int n , int m){
        int bitmask = (~0)<<m;
        return n & bitmask;
    }

    public static int clearrangeterms( int n , int i , int j){
        int a = (~0)<< (j+1);
        int b = (1<<i) - 1 ;
        int bitmask = a | b ;
        
        return n & bitmask;
    }

    public static boolean isitpoweroftwo( int n ){
        // int bitmask = n-1;
        int res = n & (n-1);
        if ( res == 0){
            return true;
        }
        else {
            return false;
        }
        // return(n&(n-1)==0);
    }

    public static int countsetbit(int n){
        int count = 0;
        
        while (n>0){
            if ((n & 1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static long fastexpo(int a , int n){
        long ans = 1;

        while ( n> 0){
            if ((n & 1) != 0){
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        oddoreven(6);
        System.out.println(updateithterm(10, 2 , 1));
        System.out.println(cleariterms(15, 2));
        System.out.println(clearrangeterms(10, 2, 4));
        System.out.println(isitpoweroftwo(7));
        System.out.println(countsetbit(16 ));

        System.out.println(fastexpo(5, 100000));
    }
    
}
