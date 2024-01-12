package functn;

public class dectobi {
    public static int db(int n){
        int decimalno = 0 ;
        int b = 1;
        
        while (n>0){
            int a = (n%2 );
            decimalno = decimalno + a * b;
            
            n = n/2;
            b = b * 10;
           


        }
        System.out.println(decimalno);
        return decimalno;
    }

    public static void main(String args[]){
        db(4);
    }
    
}
