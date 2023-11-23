public class set_ith {
    
    public static int set_bit(int n, int i){
        return n | (1<<i);
    }



    public static void main(String[] args){
        System.out.println("after setting ith bit as 1 : " + set_bit(10,2));
    }


}
