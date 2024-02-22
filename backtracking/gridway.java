package backtracking;

public class gridway { // time compexity is exponential 
    public static int gridways(int i ,int j, int n , int m){
        // we can also solve this problem using purmutation formulas 
        // ((n-1)+(m-1))!/ (n-1)!(m-1)!
        // base case
        if(i ==n-1 && j== m-1){
            return 1; // condition for last cell
        }
        else if(i ==n || j ==m){
            return 0;
        }
        int w1 =gridways( i+1, j, n, m);
        int w2 = gridways(i, j+1, n, m);
        return w1+w2;
    }
    public static void main(String[] args) {
        int n =4 ,m =3 ;
        System.out.println(gridways( 0 ,0 ,n, m));
    }
}
