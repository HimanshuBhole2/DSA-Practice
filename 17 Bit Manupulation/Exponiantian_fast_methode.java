public class Exponiantian_fast_methode {

    public static int pow(int a, int n){ // Here a^n
        int ans =1;
        int count =0;
        while(n>0){

            if((n&1)!=0){
                ans = ans * a;
            }

            n=n>>1;
            a = a*a;
            count++;
        }System.out.println(count);


        return ans;
    }
    public static void main(String[] args){
        System.out.println(pow(2,10));
    }
}
