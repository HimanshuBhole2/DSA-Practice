class tileProblem11{

    public static int ways(int n){
        if(n==0 || n==1)return 1;
        int total = ways(n-1)+ways(n-2);
        return total;
    }


    public static void main(String[] args){
        System.out.println(ways(4));
    }
}