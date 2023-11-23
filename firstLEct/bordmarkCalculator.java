import java.util.*;
public class bordmarkCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a = 0 ;
        for (int i = 0; i<5;i++){
            a= (sc.nextInt())/5 + a;
        }
        System.out.println("The ToTal Percentage = "+ a);

    }
}
