public class count_total_set_bits {
    
    public static int count_set_bits(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            int v =i;
            while(v>0){
                if((v&1)!=0){count++;}
                v=v>>1;
            }
        }



        return count;
    }


    public static void main(String[] args){
        System.out.println( count_set_bits(17));
    }
}
