public class count_ways_grid {
    
    public static int grid_ways(int i,int j ,int n, int m){
        //base case
        if(i==n-1 && j==m-1){
            return 1;
        }
        else if (i==n || j==m){
            return 0;
        }
        return grid_ways(i+1, j, n, m) + grid_ways(i, j+1, n, m);
    }

    public static int fact(int i){
        if(i<=1){
            return 1;
        }
        return i* fact(i-1);
    }

    public static int byLinear(int n, int m){
       
        int fact = fact(n+m-2)/(fact(n-1)*fact(m-1));
       
        return fact;
    }


    public static void main(String[] args){
       int n =3;int m = 3;
       //int count =  grid_ways(1,1,n,m);
       System.out.println(byLinear(n, m));
    }
}
