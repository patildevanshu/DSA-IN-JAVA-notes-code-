package Array_2D;

public class spiralprint {

    public static void printspiral(int matrix[][] ) {

        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length -1;
        int endcol = matrix[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {

            //top
            for (int j = startcol; j<=endcol -1; j++){
                System.out.print(matrix[startrow][j]);
            }
            
            // right
            for (int i = startrow; i<= endrow; i++){
                System.out.print(matrix[i][endcol]);
            }

            //bottom\
            for (int j=endcol -1; j>= startcol ; j--){
                if(startrow == endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]);
            }

            // left
            for (int i = endrow-1; i>= startrow +1 ;i--){
                if(startcol == endcol){
                    break;
                }
                System.out.print(matrix[i][startcol]);
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;

        }System.out.println();
        
    }
    public static int digonalsum(int martrix[][]) {
        int sum = 0;
        // for this method time complexity is O(n'2)
        // for (int i = 0; i<martrix.length; i++){
        //     for( int j =0; j<martrix[0].length ; j++){
        //         if(i == j){
        //             sum += martrix[i][j];
        //         }
        //         else if(i+j == martrix.length -1){
        //             sum+=martrix[i][j];
        //         }
        //     }
        // }

        for ( int i= 0; i< martrix.length; i++){
            // primary diagonal
            sum += martrix[i][i];
            // secoundary diagonal
            if (i != martrix.length - 1 -i){
                sum += martrix[i][martrix.length -1 -i];
            }
        }
        return sum;
        
    }

    public static void main(String[] args) {
        int matric[][]= {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        System.out.println(digonalsum(matric));
    }
    
}
