package backtracking;

public class nqueens {

    public static void nQueens(char board[][], int row){
        // base case
        if (row == board.length){
           printboard(board);
           count++;
           return; 
        }
        // column
        for(int j = 0 ; j<board.length; j++){
            if(isSafe(board , row , j)){
                board[row][j] ='Q';
                nQueens(board, row+1); //function call
                board[row][j] ='.'; //back tracking
            }
        }
    }
    public static boolean isnQueens(char board[][], int row){
        // base case
        if (row == board.length){
           //printboard(board);
           count++;
           return true; 
        }
        // column
        for(int j = 0 ; j<board.length; j++){
            if(isSafe(board , row , j)){
                board[row][j] ='Q';
                if (isnQueens(board, row+1)){
                    return true;
                } //function call
                board[row][j] ='.'; //back tracking
                
            }
        }
        return false;
    }
    public static boolean isSafe(char board[][], int row , int col){
        // verticaly up
        for (int i = row-1 ; i>= 0 ; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // diag left
        for (int i = row - 1, j = col-1 ; i>=0 && j>= 0 ; i-- ,j--){
            if(board[i][j] == 'Q'){
                return false; 
            }
        }

        // diag right
        for (int i = row - 1, j= col+1 ; i>= 0 && j<board.length ; i--,j++){
            if(board[i][j] == 'Q'){
                return false;     
            }
        }
        return true;
    }

    public static void printboard(char board[][]){
        System.out.println("-------chess board------");
        for (int i =0 ; i<board.length ;i++){
            for(int j=0; j<board[i].length ; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    static int count =0;


     public static void main(String[] args) {
         int n = 5;
         char board[][] = new char[n][n];
         for (int i = 0; i<n ; i++){
            for (int j =0 ; j<n; j++){
                board[i][j] = '.';
            }
         }

         nQueens(board, 0);
         System.out.println("----------------------------------------------");
         System.out.println(isnQueens(board, 0));
         printboard(board);
         System.out.println(count);
         
     }
}
