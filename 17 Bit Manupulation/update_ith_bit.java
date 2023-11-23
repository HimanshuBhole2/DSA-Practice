public class update_ith_bit {
    
    public static int set_bit(int n, int i){
        return n | (1<<i);
    }
    public static int clear_bit(int n,int i){
        return n & ~(1<<i);
    }

    public static int update_bit(int n,int i, int bit){
        // if(bit==0){
        //     return clear_bit(n,i);
        // }
        // else{
        //     return set_bit(n, i);
        // }

        n = clear_bit(n, i);
        return n | (bit<<i);
    }
    public static int clear_ibits(int n,int i){
        return n&((~0) << i); // OR n&(~(-1) << i)
    }

    public static void main(String[] args){
        System.out.println("The Updated bit : " + clear_ibits(15, 2));
    }


}
