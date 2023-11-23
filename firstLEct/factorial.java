public class factorial {
    public static int facto(int n){
        for(int i = n-1; i>0;i--){
            n = n *i;
        }
        return n;
    }



    public static void main(String[] args) {
        System.out.println(facto(10));
    }
}
