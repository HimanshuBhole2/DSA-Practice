public class clear_range {
    public static int bitsInaRange(int n,int i, int j){
        int a = (~0)<<(j+1);;
        int b = (1<<i)-1;
        return n&(a|b);
    }

    public static boolean pow(int n){
        return (n&(n-1))==0;
    }
    public static int countset_bit(int n){
        int count = 0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    public static void main(String[] args){
        int i =2;
        int j = 7;
        System.out.println(countset_bit(15));

    }
}
