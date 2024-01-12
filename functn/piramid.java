package functn;

public class piramid {
    public static void pira(int n ){
        for (int i = 1 ; i<= n ; i++ ){
            for ( int j = 1; j<= n-i ; j++){
                System.out.print(" ");
            }
            for ( int j = 1 ; j <= i ;j++ ){
                System.out.print("*");
            } System.out.println();
        }
    }

    public static void inverted_half_pira(int n){
        for (int i=1 ; i<=n ; i++){
            for (int j=1 ; j <=n-i+1 ; j++){
                System.out.print(j + " ");
            }System.out.println();
        }
    }

    public static void floyds(int n){
        int k = 1;
        for ( int i = 1 ; i<=n ; i++){
            
            for(int j=1 ;j<=i;j++){
                
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }

    public static void triangle(int n){
        for (int i=1 ; i<=n ; i++){
            for (int j=1 ; j<=i ; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }System.out.println();
        }
    }
    public static void butterfly(int n){
        // first half loop
        for (int i=1; i<=n; i++){
            //stars i
            for (int j = 1; j<=i ;j++){
                System.out.print("*");
            }

            //for spaces 2*(n-i)

            for (int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            // stars i

            for (int j=1; j<=i ; j++){
                System.out.print("*");
            }System.out.println();
        }

        for (int i= n; i>=1; i--){
            // secont half

            //stars i
            for (int j = 1; j<=i ;j++){
                System.out.print("*");
            }

            //for spaces 2*(n-i)

            for (int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            // stars i

            for (int j=1; j<=i ; j++){
                System.out.print("*");
            }System.out.println();
            
        }
    }
    public static void main(String args[]){
        // triangle(10);
       // floyds(5);
        butterfly(12);
    }

   
    
}
