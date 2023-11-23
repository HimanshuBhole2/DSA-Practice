// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class code{
    public void print(char arr[][]){
        System.out.println("---------------------chess----------------");
        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
static int count = 0;

    public boolean isSafe(char bord[][],int row,int col){
        //up
        for(int i = row-1;i>=0;i--){
            if(bord[i][col]=='Q'){
                return false;
            }
        }
        
        //left diagonal up
        
        for(int i =row-1,j=col-1;i>=0&&j>=0;j--,i--){
            if(bord[i][j]=='Q'){
                return false;
            }
        }
        
        //down diagonal down
        
        for(int i = row-1,j = col+1;i>=0&&j<bord.length;i--,j++){
             if(bord[i][j]=='Q'){
                return false;
            }
        }
        
        return true;
    }
    
    public void nQueen(char bord[][] , int row){
       if(row==bord.length){
           print(bord);
           count++;
           return;
       }
       

        for(int i = 0;i<bord.length;i++){
            if(isSafe(bord,row,i)){
                bord[row][i] = 'Q';
                nQueen(bord,row+1);
                bord[row][i] = 'x';
            }
            
        }
    }
    
}


class n_queenCount {
    public static void main(String[] args) {
        char[][] bord = new char[6][6];
       
       for(int i =0;i<bord.length;i++){
            for(int j = 0;j<bord.length;j++){
                bord[i][j] = 'x';
            }
        }
       
        code cd = new code();
        
        cd.print(bord);
        cd.nQueen(bord,0);
        System.out.println(cd.count);
        
        
    }
}
