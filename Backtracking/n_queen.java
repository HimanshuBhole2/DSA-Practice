class n_queen{

    public static boolean isSafe(char bord[][],int row,int col){
        //Up
        for(int i = row-1;i>=0;i--){
            if(bord[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left
        for(int i = row-1,j = col-1;i>=0&&j>=0;i--,j--){
            if(bord[i][j]=='Q'){
                return false;
            }
        }

        //diagonal Right
        for(int i= row-1,j = col+1;i>=0&&j<bord.length;i--,j++){
            if(bord[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void nQueen(char bord[][],int row){
        //Base Case
        if(row == bord.length){
            print(bord);
            return;
        }
        for(int i =0;i<bord.length;i++){
           if(isSafe(bord, row, i))
           { bord[row][i] = 'Q';
            nQueen(bord, row+1);
            bord[row][i] = 'x';}

        }
    }

    public static void print(char[][] bord){
        System.out.println("-----------------------chess-----------------------");
        for(int i = 0;i<bord.length;i++){
            for(int j = 0;j<bord[0].length;j++){
                System.out.print(bord[i][j] +  " ");
            }System.out.println(" ");
        }
    }

    public static void main(String[] args){
        

        char bord[][] = new char[5][5];

        for(int i = 0;i<bord.length;i++){
            for(int j = 0;j<bord[0].length;j++){
                bord[i][j] = 'x';
            }
        }
        print(bord);
        nQueen(bord,0);
    }


}