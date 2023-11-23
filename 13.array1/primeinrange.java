import java.util.Scanner;

public class primeinrange {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int big = inp.nextInt();
        System.out.print("Prime Numbers are : ");
        for(int i = 1;i<=big;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

}
