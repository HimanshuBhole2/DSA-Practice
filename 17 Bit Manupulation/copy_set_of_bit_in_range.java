public class copy_set_of_bit_in_range {
    
    public static int set_of_bit(int a, int b, int l, int r){
       int m = r-l+1;
       int v = 1<<m;
       v = v-1;
       v = v<<(l-1);
        int result;
       result = (a|(v&b));
        return result;
    }
    public static void main(String[] args){
        System.out.println(set_of_bit(8, 7,1, 2));
    }
}
