package backtracking;

public class sudoku {

    public static boolean sodukusolver(int sudoku[][], int row, int col){
        // base case
        if (row==9 && col == 0){
            return true;
        }
        // recursion
        int nextrow = row , nextcol = col+1;
        if (col+1 == 9){
            nextrow = row+1;
            nextcol = 0;
        }

        if (sudoku[row][col] != 0){
            return sodukusolver(sudoku, nextrow, nextcol);
        }
        for(int digit =1; digit<=9; digit++){
            if(isSafe(sudoku , row , col , digit)){
                sudoku[row][col] = digit;
                if(sodukusolver(sudoku, nextrow, nextcol)){
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }

        return false;
    }

    public static boolean isSafe(int sudoku[][] , int row , int col , int digit){
        // boolean result = false;
        // columns
        for (int i=0; i<9 ; i++){
            if (sudoku[i][col]==digit){
                return false;
            }
        }
        //  row
        for (int j = 0 ; j<9 ;j++){
            if (sudoku[row][j]==digit){
                return false;
            }
        }
        // BLOCK 
        int sr = (row/3) *3;
        int sc = (col/3) *3;

        for (int i = sr; i <= sr+2 ; i++){
            for ( int j = sc ; j<= sc+2 ; j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }

        return true;
    }

    public static void printArr(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for (int j =0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        int sudoku [] [] = { {0, 0, 8, 0, 0, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 0, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 2, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 0},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 3}};

        printArr(sudoku);
        sodukusolver(sudoku, 0, 0);
        System.out.println(sodukusolver(sudoku, 0, 0));
        System.out.println("---------------------");
        printArr(sudoku);
    };
}
