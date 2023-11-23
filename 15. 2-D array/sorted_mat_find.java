public class sorted_mat_find {
    
    public static void search_key(int mat[][],int key){
        int row = 0;
        int col= mat[0].length-1;
        while(row<mat.length && col >=0){
            if(mat[row][col]==key){
                System.out.println("key " + key + " is FOund at ROw : "+ row + " Column : " +col);
                return;}
            else if(mat[row][col]>key){col--;}
            else{row++;};
        }
        System.out.println("NOt Found");
    }


    public static void main(String[] args){
        int matrix[][] = {
            {10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}
        };
        search_key(matrix, 50);

    }
}
