public class sudoku_solver {
        public static boolean isSafe(int sudoku[][],int row,int col,int val ){
         for(int i = 0;i<=8;i++){
            if(sudoku[row][i]==val){
                return false;
            }
        }
         for(int i = 0;i<=8;i++){
            if(sudoku[i][col]==val){
                return false;
            }
        }
        int min_row = (row/3) * 3;
        int min_col = (col/3) * 3;
        for(int i = min_row;i<min_row+3;i++){
            for(int j = min_col;j<min_col+3;j++){
                if(sudoku[i][j] == val){
                    return false;
                }
            }
        }

          return (true);
    }



    public static boolean sudoku_solve(int sudoku[][],int row,int col){
        
        // basecase
        if(row ==9 && col==0){
            return true;
        }

        //recursion

        int nextRow = row;int nextCol = col+1;
        if(col+1==9){
            nextRow = row+1;
            nextCol = 0;
        }
        
        if(sudoku[row][col]!=0){
            return sudoku_solve(sudoku, nextRow, nextCol);
        }

        for(int digit =1;digit<=9;digit++){
           
            if(isSafe(sudoku, row, col,digit)){
                sudoku[row][col] = digit;
                if(sudoku_solve(sudoku,nextRow,nextCol)){
                    return true;
                }
                sudoku[row][col] =0;
            }
        }
        return false;
    }

    public static void print(int arr[][]){
        for(int i =0;i<arr.length;i++){
            if(i%3==0){
                    System.out.println ("------------------------ ");
                }
            for(int j=0;j<arr.length;j++){
                if(j%3==0){
                    System.out.print ("| ");
                }
                System.out.print(arr[i][j] + " ");
                
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        int sudoku[][] ={
            { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
            { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
            { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
            { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
            { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
            { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
            { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
            { 0, 9, 0, 0, 0, 0, 4, 0, 0 } 
          };

        print(sudoku);
        System.out.println("------------------------new-------------------------");
        sudoku_solve(sudoku,0,0);
        print(sudoku);

    }


}
