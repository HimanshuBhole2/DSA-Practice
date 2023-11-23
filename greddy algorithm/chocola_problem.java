import java.util.*;
public class chocola_problem {
    

    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVr[] = {2,1,3,1,4};
        Integer costHr[] = {4,1,2};
        
        Arrays.sort(costHr,Collections.reverseOrder());
        Arrays.sort(costVr,Collections.reverseOrder());
        int h = 0,v= 0; 

        int hp = 1,vp = 1;
        int price = 0;
        while((h<=costHr.length-1) && (v<=costVr.length-1)){
            // It checking which is greater

            if(costHr[h]>costVr[v]){
                price+=costHr[h]*vp;
                hp++;
                h++;
            }
            else{
                price +=costVr[v]*hp;
                vp++;
                v++;

            }
        }

        while(h<=costHr.length-1){
            price += costHr[h]*vp;
            hp++;
            h++;
        }
        while(h<=costHr.length-1){
            price +=costVr[v]*hp;
            vp++;
            v++;
        }

        System.out.println("The Required Price : " + price);

    }
}
